package org.etsi.osl.tmf.po622.model;

import java.util.List;
import java.util.Set;
import org.etsi.osl.tmf.common.model.Any;
import org.etsi.osl.tmf.common.model.service.Characteristic;
import org.etsi.osl.tmf.common.model.service.Note;
import org.etsi.osl.tmf.common.model.service.ResourceRef;
import org.etsi.osl.tmf.common.model.service.ServiceRef;
import org.etsi.osl.tmf.prm669.model.RelatedParty;
import org.etsi.osl.tmf.so641.model.ServiceOrderRelationship;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ProductOrderMapper {

  @Mapping(target = "uuid", ignore = true)
  @Mapping(target = "baseType", ignore = true)
  @Mapping(target = "href", ignore = true)
  @Mapping(target = "schemaLocation", ignore = true)
  @Mapping(target = "type", ignore = true)
  ProductOrder fromProductOrderUpdate(ProductOrderUpdate rpdto);



  @Mapping(target = "baseType", ignore = true)
  @Mapping(target = "schemaLocation", ignore = true)
  @Mapping(target = "href", ignore = true)
  @Mapping(target = "type", ignore = true)
  @Mapping(target = "uuid", ignore = true)
  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  @Mapping(target = "productOrderItem", expression = "java(updateProductOrderItem(entity, updateEntity))")
  @Mapping(target = "note", expression = "java(updateNote(entity, updateEntity))")
  @Mapping(target = "relatedParty", expression = "java(updateRelatedParty(entity, updateEntity))")
  ProductOrder updateProductOrder(@MappingTarget ProductOrder entity,
      ProductOrderUpdate updateEntity);

  default Set<ProductOrderItem> updateProductOrderItem(ProductOrder so,
      ProductOrderUpdate updateEntity) {
    if (updateEntity.getProductOrderItem() != null) {
      for (ProductOrderItem soiUpd : updateEntity.getProductOrderItem()) {
        ProductOrderItem soiOrigin = so.findOrderItemById(soiUpd.getId());
        if (soiOrigin != null) {
          soiOrigin = updateOrderItem(soiOrigin, soiUpd);


          /**
           * When we patch the order and see a MODIFY or DELETE action, we set the state to
           * ACKNOWLEDGED
           */
          if (soiOrigin.getAction().equals(OrderItemActionType.MODIFY)
              || soiOrigin.getAction().equals(OrderItemActionType.DELETE)) {
            soiOrigin.setState(ProductOrderItemStateType.ACKNOWLEDGED);
            so.setState(ProductOrderStateType.ACKNOWLEDGED);


          }

        }else {
          so.addProductOrderItemItem(soiUpd);
        }
      }
    }
    return so.getProductOrderItem();
  }


  default ProductOrderItem updateOrderItem(final ProductOrderItem soi, final ProductOrderItem soiUpd) {
    ProductOrderItem soiOrigin = soi;
    if (soiUpd.getAction() != null) {
      soiOrigin.setAction(soiUpd.getAction());
    }



    if (soiUpd.getProductOffering() != null) {
      soiOrigin.setProductOffering(soiUpd.getProductOffering());
    }
    
    if (soiUpd.getProduct() != null) {
      if (soiOrigin.getProduct() == null) {
        soiOrigin.setProduct(soiUpd.getProduct());
      } else {
        soiOrigin.getProduct().setStatus(soiUpd.getProduct().getStatus());// this probably will
                                                                          // change only
        soiOrigin.getProduct().setName(soiUpd.getProduct().getName());


        for (Characteristic updChar : soiUpd.getProduct().getProductCharacteristic()) {
          String charname = updChar.getName();
          Characteristic originChar = soiOrigin.getProduct().findCharacteristicByName(charname);
          if ((originChar != null) && (updChar != null) && (originChar.getValue() != null)
              && (originChar.getValue().getValue() != null) && (updChar.getValue() != null)) {
            if (!originChar.getValue().getValue().equals(updChar.getValue().getValue())) {
              originChar.setValue(new Any(updChar.getValue()));
            }
          } else if ((originChar != null) && (originChar.getValue() == null)
              && (updChar.getValue() != null)) {
            originChar.setValue(new Any(updChar.getValue()));
          }
        }

        // we need also to update supportingServices
        for (ServiceRef serviceRef : soiUpd.getProduct().getRealizingService()) {
          if (soiOrigin.getProduct().getRealizingServiceById(serviceRef.getId()) == null) {
            soiOrigin.getProduct().addRealizingServiceItem(serviceRef);
          }
        }

        for (ResourceRef resourceRef : soiUpd.getProduct().getRealizingResource()) {
          if (soiOrigin.getProduct().getRealizingResourceById(resourceRef.getId()) == null) {
            soiOrigin.getProduct().addRealizingResourceItem(resourceRef);
          }
        }


      }
    }
    return soiOrigin;
  }



  default Set<Note> updateNote(ProductOrder so, ProductOrderUpdate updateEntity) {
    if (updateEntity.getNote() != null) {
      for (Note n : updateEntity.getNote()) {
        if (n.getUuid() == null) {
          so.addNoteItem(n);
        }
      }

    }
    return so.getNote();
  }

  default Set<RelatedParty> updateRelatedParty(ProductOrder so, ProductOrderUpdate updateEntity) {
    if (updateEntity.getRelatedParty() != null) {
      for (RelatedParty n : updateEntity.getRelatedParty()) {
        if (n.getUuid() == null) {
          so.addRelatedPartyItem(n);
        }
      }
    }
    return so.getRelatedParty();
  }


}

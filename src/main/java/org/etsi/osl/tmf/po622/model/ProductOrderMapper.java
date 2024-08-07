package org.etsi.osl.tmf.po622.model;

import java.util.List;
import java.util.Set;
import org.etsi.osl.tmf.common.model.service.Note;
import org.etsi.osl.tmf.prm669.model.RelatedParty;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper( 
		nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
		nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS   )
public interface ProductOrderMapper {
  
	@Mapping(target = "uuid", ignore = true)
	@Mapping(target = "baseType", ignore = true)
	@Mapping(target = "href", ignore = true)
	@Mapping(target = "schemaLocation", ignore = true)
	@Mapping(target = "type", ignore = true)
	ProductOrder fromProductOrderUpdate( ProductOrderUpdate rpdto );
	

	
	@Mapping(target = "baseType", ignore = true)
	@Mapping(target = "schemaLocation", ignore = true)
	@Mapping(target = "href", ignore = true)
	@Mapping(target = "type", ignore = true)
	@Mapping(target = "uuid", ignore = true)
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "productOrderItem", expression = "java(updateProductOrderItem(entity, updateEntity))")  
    @Mapping(target = "note", expression = "java(updateNote(entity, updateEntity))")    
    @Mapping(target = "relatedParty", expression = "java(updateRelatedParty(entity, updateEntity))")    
	ProductOrder updateProductOrder(@MappingTarget ProductOrder entity, ProductOrderUpdate updateEntity);
	
	default Set<ProductOrderItem> updateProductOrderItem( ProductOrder so, ProductOrderUpdate updateEntity ){
	  if ( updateEntity.getProductOrderItem() != null ) {
        for (ProductOrderItem soiUpd :  updateEntity.getProductOrderItem()) {
          ProductOrderItem soiOrigin = so.findOrderItemById( soiUpd.getId() );
            if (soiOrigin!=null) {
                //updateOrderItem(soiOrigin, soiUpd);
                if ( soiUpd.getAction()!=null) {
                  soiOrigin.setAction( soiUpd.getAction() );
                }
                /**
                 * When we patch the order and see a MODIFY or DELETE action, we set the state to ACKNOWLEDGED
                 */
                if ( soiOrigin.getAction().equals( OrderItemActionType.MODIFY ) ||
                        soiOrigin.getAction().equals( OrderItemActionType.DELETE )) {
                    soiOrigin.setState( ProductOrderItemStateType.ACKNOWLEDGED  );
                    so.setState( ProductOrderStateType.ACKNOWLEDGED );
                    
                    
                }
                
            }
        }
      }
	  return so.getProductOrderItem();
	}
	

    default Set<Note> updateNote( ProductOrder so, ProductOrderUpdate updateEntity ){
      if (updateEntity.getNote() != null) {
        for (Note n : updateEntity.getNote()) {
            if (n.getUuid() == null) {
                so.addNoteItem(n);
            }
        }

      }
      return so.getNote();
    }
    
    default Set<RelatedParty> updateRelatedParty( ProductOrder so, ProductOrderUpdate updateEntity ){
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

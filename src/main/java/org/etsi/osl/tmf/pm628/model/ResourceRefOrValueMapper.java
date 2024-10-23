package org.etsi.osl.tmf.pm628.model;

import org.mapstruct.*;

@Mapper(
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        subclassExhaustiveStrategy = SubclassExhaustiveStrategy.RUNTIME_EXCEPTION,
        uses = {PartyRefOrPartyRoleRefMapper.class})
public interface ResourceRefOrValueMapper {

    @SubclassMapping(source = DataAccessEndpointFVO.class, target = DataAccessEndpoint.class)
    @SubclassMapping(source = LogicalResourceFVO.class, target = LogicalResource.class)
    @SubclassMapping(source = ResourceFVO.class, target = Resource.class)
    @SubclassMapping(source = ResourceRefFVO.class, target = ResourceRef.class)
    ResourceRefOrValue map(ResourceRefOrValueFVO source);

    @SubclassMapping(source = DataAccessEndpointMVO.class, target = DataAccessEndpoint.class)
    @SubclassMapping(source = LogicalResourceMVO.class, target = LogicalResource.class)
    @SubclassMapping(source = ResourceMVO.class, target = Resource.class)
    @SubclassMapping(source = ResourceRefMVO.class, target = ResourceRef.class)
    ResourceRefOrValue map(ResourceRefOrValueMVO source);
}

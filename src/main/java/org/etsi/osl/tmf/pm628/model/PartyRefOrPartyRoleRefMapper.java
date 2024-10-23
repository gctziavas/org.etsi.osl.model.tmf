package org.etsi.osl.tmf.pm628.model;

import org.mapstruct.*;

@Mapper(
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        subclassExhaustiveStrategy = SubclassExhaustiveStrategy.RUNTIME_EXCEPTION
)
public interface PartyRefOrPartyRoleRefMapper {

    @SubclassMapping(source = PartyRefFVO.class, target = PartyRef.class)
    @SubclassMapping(source = PartyRoleRefFVO.class, target = PartyRoleRef.class)
    PartyRefOrPartyRoleRef map(PartyRefOrPartyRoleRefFVO source);

    @SubclassMapping(source = PartyRefMVO.class, target = PartyRef.class)
    @SubclassMapping(source = PartyRoleRefMVO.class, target = PartyRoleRef.class)
    PartyRefOrPartyRoleRef map(PartyRefOrPartyRoleRefMVO source);
}

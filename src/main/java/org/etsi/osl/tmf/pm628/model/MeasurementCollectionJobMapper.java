package org.etsi.osl.tmf.pm628.model;

import org.mapstruct.*;

@Mapper(
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        collectionMappingStrategy = CollectionMappingStrategy.ACCESSOR_ONLY, // Collection- or map-typed properties of the target bean to be updated will be cleared and then populated with the values from the corresponding source collection or map
        uses = {
                PerformanceIndicatorSpecificationRefOrValueMapper.class,
                PartyRefOrPartyRoleRefMapper.class,
                ResourceRefOrValueMapper.class
        }
)
public interface MeasurementCollectionJobMapper {

    MeasurementCollectionJob createMeasurementCollectionJob(MeasurementCollectionJobFVO measurementCollectionJobFVO);

    @Mapping(target = "type", ignore = true)
    @Mapping(target = "baseType", ignore = true)
    @Mapping(target = "schemaLocation", ignore = true)
    @Mapping(target = "href", ignore = true)
    @Mapping(target = "uuid", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    MeasurementCollectionJob updateMeasurementCollectionJob(MeasurementCollectionJobMVO measurementCollectionJobMVO, @MappingTarget MeasurementCollectionJob measurementCollectionJob);
}

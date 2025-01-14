package org.etsi.osl.tmf.pm628.model;

import org.mapstruct.*;

@Mapper(
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        subclassExhaustiveStrategy = SubclassExhaustiveStrategy.RUNTIME_EXCEPTION
)
public interface PerformanceIndicatorSpecificationRefOrValueMapper {

    @SubclassMapping(source = PerformanceIndicatorSpecificationRefFVO.class, target = PerformanceIndicatorSpecificationRef.class)
    @SubclassMapping(source = PerformanceIndicatorSpecificationFVO.class, target = PerformanceIndicatorSpecification.class)
    PerformanceIndicatorSpecificationRefOrValue map(PerformanceIndicatorSpecificationRefOrValueFVO source);

    @SubclassMapping(source = PerformanceIndicatorSpecificationRefMVO.class, target = PerformanceIndicatorSpecificationRef.class)
    @SubclassMapping(source = PerformanceIndicatorSpecificationMVO.class, target = PerformanceIndicatorSpecification.class)
    PerformanceIndicatorSpecificationRefOrValue map(PerformanceIndicatorSpecificationRefOrValueMVO source);
}

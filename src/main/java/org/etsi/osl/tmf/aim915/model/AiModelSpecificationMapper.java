package org.etsi.osl.tmf.aim915.model;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * MapStruct mapper for AiModelSpecification entity conversions.
 * 
 * This mapper provides methods to convert between:
 * - AiModelSpecificationCreate -> AiModelSpecification
 * - AiModelSpecificationUpdate -> AiModelSpecification (for updates)
 */
@Mapper(
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface AiModelSpecificationMapper {

    /**
     * Creates a new AiModelSpecification entity from AiModelSpecificationCreate DTO.
     * Ignores system-managed fields like id, href, and lastUpdate.
     * 
     * @param create the create DTO
     * @return new AiModelSpecification entity
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "href", ignore = true)
    @Mapping(target = "lastUpdate", ignore = true)
    @Mapping(target = "atBaseType", ignore = true)
    @Mapping(target = "atSchemaLocation", ignore = true)
    @Mapping(target = "atType", ignore = true)
    AiModelSpecification fromCreate(AiModelSpecificationCreate create);

    /**
     * Updates an existing AiModelSpecification entity from AiModelSpecificationUpdate DTO.
     * Only updates non-null values from the update DTO.
     * Ignores system-managed fields like id, href, and lastUpdate.
     * 
     * @param update the update DTO
     * @param entity the existing entity to update
     * @return the updated entity
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "href", ignore = true)
    @Mapping(target = "lastUpdate", ignore = true)
    @Mapping(target = "atBaseType", ignore = true)
    @Mapping(target = "atSchemaLocation", ignore = true)
    @Mapping(target = "atType", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AiModelSpecification updateFromUpdate(AiModelSpecificationUpdate update, @MappingTarget AiModelSpecification entity);

    /**
     * Creates a new AiModelSpecification entity from AiModelSpecificationUpdate DTO.
     * Useful when creating a new entity from an update DTO.
     * Ignores system-managed fields.
     * 
     * @param update the update DTO
     * @return new AiModelSpecification entity
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "href", ignore = true)
    @Mapping(target = "lastUpdate", ignore = true)
    @Mapping(target = "atBaseType", ignore = true)
    @Mapping(target = "atSchemaLocation", ignore = true)
    @Mapping(target = "atType", ignore = true)
    AiModelSpecification fromUpdate(AiModelSpecificationUpdate update);

    /**
     * Converts a String to URI.
     * Returns null if the string is null or empty, or if it's not a valid URI.
     * 
     * @param value the string value
     * @return URI or null
     */
    default URI map(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        try {
            return new URI(value);
        } catch (URISyntaxException e) {
            return null;
        }
    }
}

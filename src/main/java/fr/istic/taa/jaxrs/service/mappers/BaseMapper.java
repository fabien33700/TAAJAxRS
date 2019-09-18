package fr.istic.taa.jaxrs.service.mappers;

import fr.istic.taa.jaxrs.domain.entities.BaseResource;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.Set;

import static java.util.stream.Collectors.toSet;

@MapperConfig
public interface BaseMapper<E, TO> {
    TO toDto(E source);

    @Mapping(target = "id", ignore = true)
    E toEntity(TO dto);

    @Mapping(target = "id", ignore = true)
    void copyEntity(E source, @MappingTarget E destination);

    default String mapSingleRelationship(BaseResource resource) {
        if (resource == null) return null;
        return resource.getUrl();
    }

    default Set<String> mapRelationships(Set<? extends BaseResource> source) {
        if (source == null) return null;
        return source
                .stream()
                .map(BaseResource::getUrl)
                .collect(toSet());
    }
}

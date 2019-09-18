package fr.istic.taa.jaxrs.service.mappers;

import fr.istic.taa.jaxrs.domain.dto.PeopleTO;
import fr.istic.taa.jaxrs.domain.entities.People;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface PeopleMapper extends BaseMapper<People, PeopleTO> {
    PeopleTO toDto(People source);

    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "films", ignore = true),
        @Mapping(target = "species", ignore = true),
        @Mapping(target = "starships", ignore = true),
        @Mapping(target = "homeworld", ignore = true)
    })
    People toEntity(PeopleTO dto);
}

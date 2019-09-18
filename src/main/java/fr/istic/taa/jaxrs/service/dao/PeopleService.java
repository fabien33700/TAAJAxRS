package fr.istic.taa.jaxrs.service.dao;


import fr.istic.taa.jaxrs.domain.dto.PeopleTO;
import fr.istic.taa.jaxrs.domain.entities.People;
import fr.istic.taa.jaxrs.service.dao.core.AbstractEntityService;
import fr.istic.taa.jaxrs.service.mappers.PeopleMapper;
import org.mapstruct.factory.Mappers;

public class PeopleService extends AbstractEntityService<PeopleTO, People> {

    public PeopleService(PeopleRepository repository,
                         PeopleMapper mapper) {
        super(repository, mapper);
    }

    public PeopleService(PeopleRepository repository) {
        super(repository, Mappers.getMapper(PeopleMapper.class));
    }
}

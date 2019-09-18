package fr.istic.taa.jaxrs.service.dao;

import fr.istic.taa.jaxrs.domain.entities.People;
import fr.istic.taa.jaxrs.service.dao.core.AbstractEntityRepository;

public class PeopleRepository extends AbstractEntityRepository<People> {
    public PeopleRepository() {
        super();
    }

    @Override
    protected Class<People> entityType() {
        return People.class;
    }
}

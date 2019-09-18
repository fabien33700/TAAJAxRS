package fr.istic.taa.jaxrs.service.jpa;

import fr.istic.taa.jaxrs.service.dao.PeopleRepository;
import fr.istic.taa.jaxrs.service.dao.PeopleService;

public abstract class ServiceFactory {

    private static PeopleService peopleService;

    private ServiceFactory() {}

    public static PeopleService getPeopleService() {
        if (peopleService == null) {
            PeopleRepository peopleRepository = new PeopleRepository();
            peopleService = new PeopleService(peopleRepository);
        }
        return peopleService;
    }
}

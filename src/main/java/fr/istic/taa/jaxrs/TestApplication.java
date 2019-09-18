package fr.istic.taa.jaxrs;

import fr.istic.taa.jaxrs.configuration.CustomJacksonProvider;
import fr.istic.taa.jaxrs.controllers.PeopleController;
import fr.istic.taa.jaxrs.controllers.RootApiEndpoint;

import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class TestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
       return new HashSet<>(
           asList(RootApiEndpoint.class, PeopleController.class));
    }

    @Override
    public Set<Object> getSingletons() {
        return Collections.singleton(new CustomJacksonProvider());
    }
}

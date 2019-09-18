package fr.istic.taa.jaxrs.controllers;

import fr.istic.taa.jaxrs.domain.dto.PeopleTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static fr.istic.taa.jaxrs.service.jpa.ServiceFactory.getPeopleService;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/api/people")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class PeopleController extends AbstractController<PeopleTO> {

    public PeopleController() {
        super(getPeopleService());
    }
}

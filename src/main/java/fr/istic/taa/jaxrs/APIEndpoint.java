package fr.istic.taa.jaxrs;

import fr.istic.taa.jaxrs.domain.dto.PeopleTO;
import fr.istic.taa.jaxrs.domain.entities.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class APIEndpoint {

    private static final Logger logger = LoggerFactory.getLogger(APIEndpoint.class);

    @GET
    @Path("/people")
    public PeopleTO getPeople() {
        PeopleTO p = new PeopleTO();
    	p.setName("Luke Skywalker");
    	return p;
    }

}


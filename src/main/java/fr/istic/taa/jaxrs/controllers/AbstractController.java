package fr.istic.taa.jaxrs.controllers;

import fr.istic.taa.jaxrs.domain.dto.BaseResourceTO;
import fr.istic.taa.jaxrs.service.dao.core.EntityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

import static java.util.Objects.requireNonNull;

public abstract class AbstractController<TO extends BaseResourceTO> {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected final EntityService<TO> entityService;

    protected AbstractController(EntityService<TO> entityService) {
        this.entityService = requireNonNull(entityService, "entity service");
    }

    @GET
    public List<TO> getAll() {
        return entityService.getAll();
    }

    @GET
    @Path("/{id}")
    public TO get(@PathParam("id") long id) {
        return entityService.get(id)
                .orElseThrow(NotFoundException::new);
    }

    @POST
    public TO create(TO dto) {
        return entityService.create(dto);
    }

    @PUT
    @Path("/{id}")
    public TO update(@PathParam("id") long id, TO dto) {
        entityService.update(id, dto);
        return get(id);
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") long id) {
        entityService.delete(id);
        return Response.ok().build();
    }
}

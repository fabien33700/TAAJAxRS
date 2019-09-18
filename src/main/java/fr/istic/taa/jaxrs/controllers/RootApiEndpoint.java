package fr.istic.taa.jaxrs.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/api")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class RootApiEndpoint {

    private static final Logger logger = LoggerFactory.getLogger(RootApiEndpoint.class);

    @GET
    @Path("/")
    public Map<String, String> getAPIsList(@Context HttpServletRequest request) {
        return Stream.of(
            "people"
        ).collect(toMap(
                Function.identity(),
                path -> request.getRequestURL()
                        .append(path)
                        .toString()
        ));
    }
/*
    private Map<String, String> getEndpointMap(String basePath, String url) {
        return controllers.stream()
            .filter(AbstractController.class::isAssignableFrom)
            .filter(clazz -> clazz.isAnnotationPresent(Path.class))
            .map(clazz -> clazz.getAnnotation(Path.class).value())
            .collect(toMap(
                    path -> path.replaceAll(basePath, ""),
                    path -> url + path
            ));
    }
*/

}


package fr.istic.taa.jaxrs.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class BaseResourceTO {
    private Instant created;
    private Instant edited;
    private String url;
}

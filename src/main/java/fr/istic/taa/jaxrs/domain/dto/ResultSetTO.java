package fr.istic.taa.jaxrs.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class ResultSetTO<R extends BaseResourceTO> {
    private long count;
    private String next;
    private String previous;
    private List<R> results;
}

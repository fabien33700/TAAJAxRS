package fr.istic.taa.jaxrs.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class PlanetTO extends BaseResourceTO {
    private String name;
    private long rotationPeriod;
    private long orbitalPeriod;
    private long diameter;
    private Set<String> climate;
    private Set<String> terrain;
    private float surfaceWater;
    private long population;
    private Set<String> residents;
    private Set<String> films;
}


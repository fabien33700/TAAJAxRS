package fr.istic.taa.jaxrs.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Set;

@Entity
@Getter
@Setter
public class Planet extends BaseResource {
    private String name;
    private long rotationPeriod;
    private long orbitalPeriod;
    private long diameter;
    private Set<String> climate;
    private Set<String> terrain;
    private float surfaceWater;
    private long population;
    private Set<People> residents;
    private Set<Film> films;
}


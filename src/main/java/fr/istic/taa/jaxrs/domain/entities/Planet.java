package fr.istic.taa.jaxrs.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
@Setter
public class Planet extends BaseResource {
    private String name;
    private long rotationPeriod;
    private long orbitalPeriod;
    private long diameter;
    private String climate;
    private String terrain;
    private float surfaceWater;
    private long population;


    @OneToMany(mappedBy = "homeworld")
    private Set<People> residents;

    @ManyToMany
    private Set<Film> films;
}


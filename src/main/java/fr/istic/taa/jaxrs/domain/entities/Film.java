package fr.istic.taa.jaxrs.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
public class Film extends BaseResource {
    private String title;
    private int episodeId;
    private String openingCrawl;
    private String director;
    private String producer;
    private LocalDateTime releaseDate;

    @ManyToMany
    private Set<People> characters;

    @ManyToMany
    private Set<Planet> planets;

    @ManyToMany
    private Set<Starship> starships;

    @ManyToMany
    private Set<Vehicle> vehicles;

    @ManyToMany
    private Set<Specie> species;

}

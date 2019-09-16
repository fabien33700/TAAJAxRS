package fr.istic.taa.jaxrs.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
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
    private Set<People> characters;
    private Set<Planet> planets;
    private Set<Starship> starships;
    private Set<Vehicle> vehicles;
    private Set<Specie> species;

}

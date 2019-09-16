package fr.istic.taa.jaxrs.domain.dto;

import fr.istic.taa.jaxrs.domain.entities.BaseResource;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
public class FilmTO extends BaseResource {
    private String title;
    private int episodeId;
    private String openingCrawl;
    private String director;
    private String producer;
    private LocalDateTime releaseDate;
    private Set<String> characters;
    private Set<String> planets;
    private Set<String> starships;
    private Set<String> vehicles;
    private Set<String> species;

}

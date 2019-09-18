package fr.istic.taa.jaxrs.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
@Setter
@Getter
public class People extends BaseResource {
    private String name;
    private int height;
    private int mass;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private String birthYear;
    private String gender;

    @ManyToOne
    private Planet homeworld;

    @ManyToMany
    private Set<Film> films;

    @ManyToMany
    private Set<Specie> species;

    @ManyToMany
    private Set<Starship> starships;
}

package fr.istic.taa.jaxrs.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Set;

@Entity
@Setter
@Getter
public class Specie extends BaseResource {
    private String name;
    private String classification;
    private String designation;
    private int averageHeight;
    private Set<String> skinColors;
    private Set<String> hairColors;
    private Set<String> eyeColors;
    private int averageLifespan;
    private Planet homeworld;
    private String language;
    private Set<People> people;
    private Set<Film> films;
}

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
public class Specie extends BaseResource {
    private String name;
    private String classification;
    private String designation;
    private int averageHeight;
    private String skinColors;
    private String hairColors;
    private String eyeColors;
    private int averageLifespan;
    @ManyToOne
    private Planet homeworld;
    private String language;
    @ManyToMany
    private Set<People> people;
    @ManyToMany
    private Set<Film> films;
}

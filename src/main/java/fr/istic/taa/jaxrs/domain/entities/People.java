package fr.istic.taa.jaxrs.domain.entities;

import fr.istic.taa.jaxrs.domain.enums.EyeColorEnum;
import fr.istic.taa.jaxrs.domain.enums.GenderEnum;
import fr.istic.taa.jaxrs.domain.enums.HairColorEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Set;

@Entity
@Setter
@Getter
public class People extends BaseResource {
    private String name;
    private int height;
    private int mass;
    private HairColorEnum hairColor;
    private String skinColor;
    private EyeColorEnum eyeColor;
    private String birthYear;
    private GenderEnum gender;
    private String homeworld;
    private Set<Film> films;
    private Set<Specie> species;
    private Set<Starship> starships;
}

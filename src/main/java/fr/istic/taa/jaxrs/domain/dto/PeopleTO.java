package fr.istic.taa.jaxrs.domain.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter

public class PeopleTO extends BaseResourceTO {
    private String name;
    private int height;
    private int mass;
    private String hairColor;
    private String eyeColor;
    private String skinColor;
    private String birthYear;
    private String gender;
    private String homeworld;
    private Set<String> films;
    private Set<String> species;
    private Set<String> starships;
}

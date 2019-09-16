package fr.istic.taa.jaxrs.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class SpecieTO extends BaseResourceTO {
    private String name;
    private String classification;
    private String designation;
    private int averageHeight;
    private Set<String> skinColors;
    private Set<String> hairColors;
    private Set<String> eyeColors;
    private int averageLifespan;
    private String homeworld;
    private String language;
    private Set<String> people;
    private Set<String> films;
}

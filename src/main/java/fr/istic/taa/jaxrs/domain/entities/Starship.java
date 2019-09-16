package fr.istic.taa.jaxrs.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Starship extends BaseVehicle {
    private float hyperdriveRating;
    private int MGLT;
    private String startshipClass;
}

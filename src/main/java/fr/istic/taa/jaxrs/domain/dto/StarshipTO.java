package fr.istic.taa.jaxrs.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StarshipTO extends BaseVehicleTO {
    private float hyperdriveRating;
    private int MGLT;
    private String startshipClass;
}

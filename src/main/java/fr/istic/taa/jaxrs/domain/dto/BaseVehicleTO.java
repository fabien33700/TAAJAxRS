package fr.istic.taa.jaxrs.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public abstract class BaseVehicleTO extends BaseResourceTO {
    protected String name;
    protected String model;
    protected String manufacturer;
    protected long costInCredits;
    protected long length;
    protected long maxAtmospheringSpeed;
    protected long crew;
    protected long passengers;
    protected long cargoCapacity;
    protected String consumables;
    protected Set<String> pilots;
    protected Set<String> films;
}

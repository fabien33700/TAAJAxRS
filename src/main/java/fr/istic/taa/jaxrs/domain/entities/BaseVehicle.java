package fr.istic.taa.jaxrs.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import java.util.Set;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseVehicle extends BaseResource {
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

    @ManyToMany
    protected Set<People> pilots;

    @ManyToMany
    protected Set<Film> films;
}

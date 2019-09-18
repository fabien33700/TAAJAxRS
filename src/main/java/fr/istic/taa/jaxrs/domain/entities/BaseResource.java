package fr.istic.taa.jaxrs.domain.entities;

import fr.istic.taa.jaxrs.service.dao.listeners.BaseResourceListener;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter @Setter
@EntityListeners(BaseResourceListener.class)
public abstract class BaseResource extends BaseEntity {
    protected LocalDateTime created;
    protected LocalDateTime edited;
    protected String url;
}

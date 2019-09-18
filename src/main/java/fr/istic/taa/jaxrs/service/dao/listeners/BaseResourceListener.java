package fr.istic.taa.jaxrs.service.dao.listeners;

import fr.istic.taa.jaxrs.domain.entities.BaseResource;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

public class BaseResourceListener {
    @PrePersist
    public void prePersist(BaseResource resource) {
        resource.setCreated(LocalDateTime.now());
    }

    @PreUpdate
    public void preUpdate(BaseResource resource) {
        resource.setEdited(LocalDateTime.now());
    }

    @PostPersist
    public void postPersist(BaseResource resource) {
        resource.setUrl(getResourceUrl(resource));
        // Avoiding to set edited at creation
        resource.setEdited(null);
    }

    private static String getResourceUrl(BaseResource resource) {
        String resourceType = resource.getClass().getSimpleName().toLowerCase();
        return "http://localhost:8080/api/" + resourceType + "/" + resource.getId();
    }
}

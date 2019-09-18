package fr.istic.taa.jaxrs.service.dao.core;

import fr.istic.taa.jaxrs.domain.entities.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface EntityRepository<E extends BaseEntity> {
    List<E> getAll();
    Optional<E> findById(long id);
    E save(E entity);
    void delete(long id);
    boolean exists(long id);
}

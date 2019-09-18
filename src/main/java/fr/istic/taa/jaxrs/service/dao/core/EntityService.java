package fr.istic.taa.jaxrs.service.dao.core;

import fr.istic.taa.jaxrs.domain.dto.BaseResourceTO;

import java.util.List;
import java.util.Optional;

public interface EntityService<TO extends BaseResourceTO> {
    Optional<TO> get(long id);
    List<TO> getAll();

    TO create(TO dto);
    void update(long id, TO dto);
    void delete(long id);
}

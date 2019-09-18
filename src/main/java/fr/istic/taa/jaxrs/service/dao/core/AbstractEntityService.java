package fr.istic.taa.jaxrs.service.dao.core;

import fr.istic.taa.jaxrs.domain.dto.BaseResourceTO;
import fr.istic.taa.jaxrs.domain.entities.BaseEntity;
import fr.istic.taa.jaxrs.service.mappers.BaseMapper;

import javax.ws.rs.NotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class AbstractEntityService<TO extends BaseResourceTO, E extends BaseEntity> implements EntityService<TO> {
    protected final EntityRepository<E> repository;
    protected final BaseMapper<E, TO> mapper;

    protected AbstractEntityService(EntityRepository<E> repository, BaseMapper<E, TO> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<TO> get(long id) {
        return repository
                .findById(id)
                .map(mapper::toDto);
    }

    @Override
    public List<TO> getAll() {
        return repository.getAll()
                .parallelStream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public TO create(TO dto) {
        E toCreate = mapper.toEntity(dto);
        E created = repository.save(toCreate);
        return mapper.toDto(created);
    }

    @Override
    public void delete(long id) {
        repository.delete(id);
    }

    @Override
    public void update(long id, TO dto) {
        E actual = repository.findById(id)
                .orElseThrow(NotFoundException::new);
        E updates = mapper.toEntity(dto);
        mapper.copyEntity(updates, actual);

        repository.save(actual);
    }
}

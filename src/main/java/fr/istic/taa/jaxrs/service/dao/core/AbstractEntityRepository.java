package fr.istic.taa.jaxrs.service.dao.core;

import fr.istic.taa.jaxrs.domain.entities.BaseEntity;
import fr.istic.taa.jaxrs.service.jpa.EntityManagerHelper;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.ws.rs.NotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public abstract class AbstractEntityRepository<E extends BaseEntity> implements EntityRepository<E> {

    protected final EntityManager entityManager;

    protected AbstractEntityRepository() {
        this.entityManager = EntityManagerHelper.getEntityManager();
    }

    protected AbstractEntityRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    protected abstract Class<E> entityType();

    @Override
    public boolean exists(long id) {
        return findById(id).isPresent();
    }

    @Override
    public List<E> getAll() {
        return entityManager
                .createQuery("select e from " + entityType().getSimpleName() + " e", entityType())
                .getResultList();
    }

    @Override
    public Optional<E> findById(long id) {
        return Optional.ofNullable(
                entityManager.find(entityType(), id));
    }

    private void executeTransaction(Consumer<EntityManager> operation) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        try {
            operation.accept(entityManager);
        } catch (RuntimeException ex) {
            tx.rollback();
            throw ex;
        }
        tx.commit();
    }

    @Override
    public E save(E entity) {
        executeTransaction(em -> {
            if (entity.getId() != 0) {
                em.merge(entity);
            } else {
                em.persist(entity);
            }
        });
        return entity;
    }

    @Override
    public void delete(long id) {
        E toRemove = findById(id)
                .orElseThrow(NotFoundException::new);
        executeTransaction(em -> em.remove(toRemove));
    }
}

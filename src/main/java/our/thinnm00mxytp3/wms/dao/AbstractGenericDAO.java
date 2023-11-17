package our.thinnm00mxytp3.wms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public abstract class AbstractGenericDAO<T, PK extends Serializable> implements GenericDAO{
    private Class<T> clazz;

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public T findById(UUID id) {
        return (T) getCurrentSession().get(clazz, id);
    }
    @Override
    public List<T> findAll() {
        return getCurrentSession().createQuery("from " + clazz.getName(),clazz).getResultList();
    }


    @Override
    public void create(Object entity) {
        getCurrentSession().persist(entity);
    }


    @Override
    public void update(Object entity) {
        getCurrentSession().merge(entity);
    }


    @Override
    public void delete(Object entity) {
        getCurrentSession().delete(entity);
    }


    @Override
    public void deleteById(UUID entityId) {
        T entity = findById(entityId);
        delete(entity);
    }
    protected final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}

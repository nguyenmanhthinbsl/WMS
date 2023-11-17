package our.thinnm00mxytp3.wms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import our.thinnm00mxytp3.wms.entities.BaseEntity;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.UUID;

public interface GenericDAO<T, PK extends Serializable> {
    //add

    void create(T entity);

    //getById
    T findById(PK id);

    T findById(UUID id);

    //getAll
    List<T> findAll();

    //Update
    void update(T transientObject);

    //deleteById
    void deleteById(PK id) throws Exception;

    //deleteByObject
    void delete(T persistentObject) throws Exception;

    public void setClazz(Class<T> clazzToSet);


    void deleteById(UUID entityId);
}

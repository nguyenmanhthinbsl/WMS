package our.thinnm00mxytp3.wms.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

public abstract class BaseDAO<T, PK extends Serializable> {
    private final Class<T> persistentClass;

    protected BaseDAO(Class<T> persistentClass) {
        this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }


}

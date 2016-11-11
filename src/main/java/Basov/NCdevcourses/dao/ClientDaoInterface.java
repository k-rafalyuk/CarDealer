package Basov.NCdevcourses.dao;

import java.io.Serializable;
import java.util.List;

public interface ClientDaoInterface <T, Id extends Serializable> {
    public void persist(T entity);
    public void update(T entity);
    public T findById(Id id);
    public void delete(Id id);
    public List<T> findAll();
    public void deleteAll();
}

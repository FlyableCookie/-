package dao;

import java.util.List;

public interface BasicDao<T> {
    T findById(Integer i);
    void save(T entity);
    void update(T entity);
    void delete(T entity);
    List<T> findAll();
}

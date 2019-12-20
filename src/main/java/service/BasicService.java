package service;

import java.util.List;

public interface BasicService<T> {
    void save(T entity);
    void update(T entity);
    void delete(Integer integer);
    T findById(Integer integer);
    List<T> findAll();
}

package dao.impl;

import dao.BasicDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BasicDaoImpl<T> implements BasicDao<T> {

    @Autowired
    SessionFactory sessionFactory;

    public abstract Class<T> getEntityClass();

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public T findById(Integer i) {
        return getSession().get(getEntityClass(), i);
    }

    @Override
    public void save(T entity) {
        getSession().persist(entity);
    }

    @Override
    public void update(T entity) {
        getSession().update(entity);
    }

    @Override
    public void delete(T entity) {
        getSession().delete(entity);
    }

    @Override
    public List<T> findAll() {
        return null;
    }
}

package dao.impl;

import dao.BasicDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
    public void delete(Integer i) {
        getSession().delete(findById(i));
    }

    @Override
    public List<T> findAll() {
        String hql = "From " + getEntityClass().getName();
        Query query = getSession().createQuery(hql);
        return query.list();
    }
}

package dao.impl;

import dao.BasicDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.util.List;

public abstract class BasicDaoImpl<T> implements BasicDao<T> {

    @Resource(name = "sessionFactory")
    SessionFactory sessionFactory;

    public abstract Class<T> getEntityClass();

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public T findById(Integer i) {
//        return getSession().persist();
        return null;
    }

    @Override
    public void save(T entity) {

    }

    @Override
    public void update(T entity) {

    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public List<T> findAll() {
        return null;
    }
}

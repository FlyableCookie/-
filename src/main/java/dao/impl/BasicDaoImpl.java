package dao.impl;

import dao.BasicDao;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.util.List;

public class BasicDaoImpl implements BasicDao {

    @Resource(name = "sessionFactory")
    SessionFactory sessionFactory;

    @Override
    public Object findById(Integer i) {
        return null;
    }

    @Override
    public void save(Object entity) {

    }

    @Override
    public void update(Object entity) {

    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public List findAll() {
        return null;
    }
}

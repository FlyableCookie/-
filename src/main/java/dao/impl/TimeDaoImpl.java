package dao.impl;

import dao.TimeDao;
import org.hibernate.query.Query;

import java.sql.Timestamp;
import java.util.List;

public abstract class TimeDaoImpl<T> extends BasicDaoImpl<T> implements TimeDao<T> {

    @Override
    public List<T> findByTime(Timestamp begin, Timestamp end) {
        String hql = "";// = "From " + getEntityClass() + "Where ";
        Query query = getSession().createQuery(hql);
        return null;
    }

    @Override
    public List<T> findByTime(Timestamp begin) {
        return null;
    }

}

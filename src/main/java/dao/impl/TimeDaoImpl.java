package dao.impl;

import dao.TimeDao;
import org.hibernate.query.Query;

import java.sql.Timestamp;
import java.util.List;

public abstract class TimeDaoImpl<T> extends BasicDaoImpl<T> implements TimeDao<T> {

    @Override
    public List<T> findByTime(Timestamp begin, Timestamp end) {
        String time_name = getTimeName();
        String hql = "From " + getEntityClass().getName()
                + " Where " + time_name + " >= :beginTime and "+time_name+" <= :endTime";
        Query query = getSession().createQuery(hql);
        query.setParameter("beginTime", begin);
        query.setParameter("endTime", end);
        return query.list();
    }

    @Override
    public List<T> findByTime(Timestamp begin) {
        String time_name = getTimeName();
        String hql = "From " + getEntityClass().getName()
                + " Where " + time_name +" > "+begin;
        Query query = getSession().createQuery(hql);
        return query.list();
    }

    private String getTimeName(){
        String s = getEntityClass().getName();
        s = s.substring(8,s.length()-6);
        s = s.substring(0, 1).toLowerCase()+s.substring(1)+"Time";
        return s;
    }
}

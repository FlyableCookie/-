package com.zxy.dao.impl;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */

import com.zxy.dao.*;
import com.zxy.entity.Room;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;

@Transactional(rollbackFor = Exception.class)
//出现Exception异常回滚
@Repository("roomDao") //进行注入
public class RoomDaoImpl implements RoomDao {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;
    private Session session;
    @Override
    public void add(Room room) {
        sessionFactory.getCurrentSession().save(room);
    }

    @Override
    public void update(Room room) {
        //apartment='"+room.getApartment()+"',
        this.sessionFactory.getCurrentSession().createSQLQuery("update Room set  phoneno='"+room.getPhoneno()+"', location='"+room.getLocation()+"', username='"+room.getUsername()+"' where location='"+room.getLocation()+"'").executeUpdate();

    }


    @Override
    public List getRoom() {
        System.out.println("读入");
        return sessionFactory.getCurrentSession().createQuery("FROM Room").list();

    }

    @Override
    public List getRoomByname(String username) {
        return sessionFactory.getCurrentSession().createQuery("FROM Room where username='"+username+"'").list();


    }


    @Override
    public void delete(String username) {

        this.sessionFactory.getCurrentSession().createSQLQuery("delete from room where username='"+username+"' ").executeUpdate();


    }
}
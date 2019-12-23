package com.zxy.service.impl;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */



import com.zxy.dao.RoomDao;
import com.zxy.entity.Room;
import com.zxy.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/*注入服务*/
@Service("roomService")
public class RoomServiceImpl implements RoomService {
    //自动注入userDao，也可以使用

   // @Resource
    @Autowired
    private RoomDao roomDao;


    @Override
    public boolean addRoom(Room room){
        this.roomDao.add(room);
        return true;
    }

    @Override
    public List getAllRoom(){
        return this.roomDao.getRoom();
    }

    @Override
    public List getRoomByname(String username){
        return this.roomDao.getRoomByname(username);
    }

    @Override
    public boolean updateRoom(Room room){
        this.roomDao.update(room);
        return true;

    }

    @Override
    public boolean deleteRoom(String username){
        this.roomDao.delete(username);
        return true;
    }
}
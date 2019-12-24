package com.zxy.service;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */


import com.zxy.entity.Room;


import java.util.List;


public interface RoomService {


    public boolean addRoom(Room room);

    public List getAllRoom();

    public List getRoomByname(String username);

    public boolean updateRoom(Room room);

    public boolean deleteRoom(String username);
}
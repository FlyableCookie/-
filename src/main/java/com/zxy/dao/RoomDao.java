package com.zxy.dao;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */

import com.zxy.entity.Room;


import java.util.List;


public interface RoomDao {
    /**
     * 添加并保存用户
     * @param room
     */
    public void add(Room room);

    /**
     * 获取用户列表
     */
    public List getRoom();

    /**
     * 获取用户信息

     * @param username
     * @return
     */
    public List getRoomByname(String username);
    /**
     * 更新用户信息
     * @param room
     */
    public void update(Room room);

    /**
     * 删除用户username
     */
    public void delete(String username);

}
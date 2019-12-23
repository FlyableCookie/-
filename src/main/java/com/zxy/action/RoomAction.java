package com.zxy.action;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */

import com.opensymphony.xwork2.ModelDriven;
import com.zxy.entity.*;
import com.zxy.service.RoomService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller("roomAction")
@Scope("prototype")
public class RoomAction extends ActionSupport implements ModelDriven<Room> {
    @Resource
    private RoomService roomService;


    private Room room = new Room ();

    @Override
    public Room getModel() {
        return room;
        //返回实例
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }






    public String getAllRoom(){
        Map session = ActionContext.getContext().getSession();
        List list= roomService.getAllRoom();
        System.out.println(list+
                "2222222222222");
        session.put("userlist",list);
        return "UserList";
    }


    public String toAddPage(){
        return "addPage";
    }


    public  String delete(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String username1=request.getParameter("username");
        System.out.println(username1);
        try {
            roomService.deleteRoom(username1);
            return "deluser";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
    public String toUptPage(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String username1=request.getParameter("username");

        Map session = ActionContext.getContext().getSession();
        List list1= roomService.getRoomByname(username1);
        System.out.println(list1+
                "11111111111111111");
        session.put("userlist1",list1);
        return "uptPage";
    }
    public String save(){
        try {
            System.out.println("添加"+room.getUsername()+room.getLocation());
            roomService.addRoom(room);
            return "adduser";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
    public String update(){
        try {
            System.out.println("修改"+room.getUsername()+room.getLocation());
            roomService.updateRoom(room);

            return "update";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

}
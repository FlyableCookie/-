package com.zxy.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */

@Entity
public class Room{
    private int id;
    private String username;
    private String location;
    private String phoneno;
    private String apartment;


    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "location", nullable = false, length = 40)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "phoneno", nullable = false, length = 20)
    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    @Basic
    @Column(name = "apartment", nullable = false, length = 40)
    public String getApartment() {
        return apartment;
    }





    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != room.id) return false;
        if (username != null ? !username.equals(room.username) : room.username != null) return false;
        if (location != null ? !location.equals(room.location) : room.location != null) return false;
        if (phoneno != null ? !phoneno.equals(room.phoneno) : room.phoneno != null) return false;
        if (apartment != null ? !apartment.equals(room.apartment) : room.apartment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (phoneno != null ? phoneno.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (apartment != null ? apartment.hashCode() : 0);
        return result;
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        User user = (User) o;
//
//        if (id != user.id) return false;
//        if (username != null ? !username.equals(user.username) : user.username != null) return false;
//        if (location != null ? !location.equals(user.location) : user.location != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (username != null ? username.hashCode() : 0);
//        result = 31 * result + (location != null ? location.hashCode() : 0);
//        return result;
//    }


}

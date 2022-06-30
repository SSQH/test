package com.whut.springboot.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

public class UserInfo implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private Integer curWeight;

    private Integer maxWeight;

    private String itemInfo;

    private Integer curRoom;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getCurWeight() {
        return curWeight;
    }

    public void setCurWeight(Integer curWeight) {
        this.curWeight = curWeight;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(String itemInfo) {
        this.itemInfo = itemInfo == null ? null : itemInfo.trim();
    }

    public Integer getCurRoom() {
        return curRoom;
    }

    public void setCurRoom(Integer curRoom) {
        this.curRoom = curRoom;
    }
}
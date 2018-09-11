package com.QST.Using.Etitys;

import java.util.Date;

public class Follow {
    private Integer id;

    private Date followDate;

    private Integer userId;

    private Integer otherUserId;

    public Follow(Integer id, Date followDate, Integer userId, Integer otherUserId) {
        this.id = id;
        this.followDate = followDate;
        this.userId = userId;
        this.otherUserId = otherUserId;
    }

    public Follow() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFollowDate() {
        return followDate;
    }

    public void setFollowDate(Date followDate) {
        this.followDate = followDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOtherUserId() {
        return otherUserId;
    }

    public void setOtherUserId(Integer otherUserId) {
        this.otherUserId = otherUserId;
    }
}
package com.QST.Using.Etitys;

import java.util.Date;

public class PlayRecord {
    private Integer id;

    private Date firstPlayTime;

    private Integer times;

    private Date lastPlayTime;

    private Integer userId;

    private Integer songId;

    public PlayRecord(Integer id, Date firstPlayTime, Integer times, Date lastPlayTime, Integer userId, Integer songId) {
        this.id = id;
        this.firstPlayTime = firstPlayTime;
        this.times = times;
        this.lastPlayTime = lastPlayTime;
        this.userId = userId;
        this.songId = songId;
    }

    public PlayRecord() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFirstPlayTime() {
        return firstPlayTime;
    }

    public void setFirstPlayTime(Date firstPlayTime) {
        this.firstPlayTime = firstPlayTime;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Date getLastPlayTime() {
        return lastPlayTime;
    }

    public void setLastPlayTime(Date lastPlayTime) {
        this.lastPlayTime = lastPlayTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }
}
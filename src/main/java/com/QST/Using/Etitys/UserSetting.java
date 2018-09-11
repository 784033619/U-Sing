package com.QST.Using.Etitys;

public class UserSetting {
    private Integer id;

    private Integer letter;

    private Byte songListCollect;

    private Byte videoCollect;

    private Byte praiseGet;

    private Byte newFan;

    private Byte songRank;

    private Integer userId;

    public UserSetting(Integer id, Integer letter, Byte songListCollect, Byte videoCollect, Byte praiseGet, Byte newFan, Byte songRank, Integer userId) {
        this.id = id;
        this.letter = letter;
        this.songListCollect = songListCollect;
        this.videoCollect = videoCollect;
        this.praiseGet = praiseGet;
        this.newFan = newFan;
        this.songRank = songRank;
        this.userId = userId;
    }

    public UserSetting() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLetter() {
        return letter;
    }

    public void setLetter(Integer letter) {
        this.letter = letter;
    }

    public Byte getSongListCollect() {
        return songListCollect;
    }

    public void setSongListCollect(Byte songListCollect) {
        this.songListCollect = songListCollect;
    }

    public Byte getVideoCollect() {
        return videoCollect;
    }

    public void setVideoCollect(Byte videoCollect) {
        this.videoCollect = videoCollect;
    }

    public Byte getPraiseGet() {
        return praiseGet;
    }

    public void setPraiseGet(Byte praiseGet) {
        this.praiseGet = praiseGet;
    }

    public Byte getNewFan() {
        return newFan;
    }

    public void setNewFan(Byte newFan) {
        this.newFan = newFan;
    }

    public Byte getSongRank() {
        return songRank;
    }

    public void setSongRank(Byte songRank) {
        this.songRank = songRank;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
package com.QST.Using.Etitys;

import java.util.Date;

public class SonglistSong {
    private Integer tbSonglistId;

    private Integer songId;

    private Date addDate;

    public SonglistSong(Integer tbSonglistId, Integer songId, Date addDate) {
        this.tbSonglistId = tbSonglistId;
        this.songId = songId;
        this.addDate = addDate;
    }

    public SonglistSong() {
        super();
    }

    public Integer getTbSonglistId() {
        return tbSonglistId;
    }

    public void setTbSonglistId(Integer tbSonglistId) {
        this.tbSonglistId = tbSonglistId;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
}
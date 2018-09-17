package com.example.using.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SonglistSong {
    private Integer tbSonglistId;

    private Integer songId;

    private Date addDate;

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
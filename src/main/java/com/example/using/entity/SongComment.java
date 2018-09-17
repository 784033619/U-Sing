package com.example.using.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component

public class SongComment {
    private Integer songId;

    private Integer userId;

    private Integer id;

    private Integer songCommentId;

    private Date createTime;

    private Integer praiseTimes;

    private String content;

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSongCommentId() {
        return songCommentId;
    }

    public void setSongCommentId(Integer songCommentId) {
        this.songCommentId = songCommentId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPraiseTimes() {
        return praiseTimes;
    }

    public void setPraiseTimes(Integer praiseTimes) {
        this.praiseTimes = praiseTimes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
package com.example.using.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component

public class SonglistComment {
    private Integer id;

    private Integer userId;

    private Integer songListId;

    private Date createTime;

    private Integer praiseTimes;

    private Integer replayComment;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSongListId() {
        return songListId;
    }

    public void setSongListId(Integer songListId) {
        this.songListId = songListId;
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

    public Integer getReplayComment() {
        return replayComment;
    }

    public void setReplayComment(Integer replayComment) {
        this.replayComment = replayComment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
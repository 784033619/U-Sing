package com.QST.Using.Etitys;

import java.util.Date;

public class Songlist {
    private Integer id;

    private Integer userId;

    private Integer songListId;

    private Date createTime;

    private Integer praiseTimes;

    private Integer replayComment;

    private String content;

    public Songlist(Integer id, Integer userId, Integer songListId, Date createTime, Integer praiseTimes, Integer replayComment, String content) {
        this.id = id;
        this.userId = userId;
        this.songListId = songListId;
        this.createTime = createTime;
        this.praiseTimes = praiseTimes;
        this.replayComment = replayComment;
        this.content = content;
    }

    public Songlist() {
        super();
    }

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
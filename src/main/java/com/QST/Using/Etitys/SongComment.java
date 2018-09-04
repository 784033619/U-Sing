package com.QST.Using.Etitys;

import java.util.Date;

public class SongComment {
    private Integer id;

    private Integer songId;

    private Integer userId;

    private Integer songCommentId;

    private Date createTime;

    private Integer praiseTimes;

    private String content;

    public SongComment(Integer id, Integer songId, Integer userId, Integer songCommentId, Date createTime, Integer praiseTimes, String content) {
        this.id = id;
        this.songId = songId;
        this.userId = userId;
        this.songCommentId = songCommentId;
        this.createTime = createTime;
        this.praiseTimes = praiseTimes;
        this.content = content;
    }

    public SongComment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
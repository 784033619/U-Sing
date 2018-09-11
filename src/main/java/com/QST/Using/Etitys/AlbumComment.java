package com.QST.Using.Etitys;

import java.util.Date;

public class AlbumComment {
    private Integer id;

    private Integer replyCommentId;

    private Integer albumId;

    private Integer userId;

    private Date createDate;

    private Integer praiseTimes;

    private String content;

    public AlbumComment(Integer id, Integer replyCommentId, Integer albumId, Integer userId, Date createDate, Integer praiseTimes, String content) {
        this.id = id;
        this.replyCommentId = replyCommentId;
        this.albumId = albumId;
        this.userId = userId;
        this.createDate = createDate;
        this.praiseTimes = praiseTimes;
        this.content = content;
    }

    public AlbumComment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReplyCommentId() {
        return replyCommentId;
    }

    public void setReplyCommentId(Integer replyCommentId) {
        this.replyCommentId = replyCommentId;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
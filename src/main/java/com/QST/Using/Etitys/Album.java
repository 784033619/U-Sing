package com.QST.Using.Etitys;

import java.util.Date;

public class Album {
    private Integer id;

    private Date publishDate;

    private Integer singerId;

    public Album(Integer id, Date publishDate, Integer singerId) {
        this.id = id;
        this.publishDate = publishDate;
        this.singerId = singerId;
    }

    public Album() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getSingerId() {
        return singerId;
    }

    public void setSingerId(Integer singerId) {
        this.singerId = singerId;
    }
}
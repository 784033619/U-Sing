package com.QST.Using.Etitys;

import java.util.Date;

public class Album {
    private Integer id;

    private Date publishDate;

    private Integer singerId;

    private String pic;

    private String md5file;

    public Album(Integer id, Date publishDate, Integer singerId, String pic, String md5file) {
        this.id = id;
        this.publishDate = publishDate;
        this.singerId = singerId;
        this.pic = pic;
        this.md5file = md5file;
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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getMd5file() {
        return md5file;
    }

    public void setMd5file(String md5file) {
        this.md5file = md5file == null ? null : md5file.trim();
    }
}
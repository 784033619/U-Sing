package com.QST.Using.Etitys;

import java.util.Date;

public class Songlist {
    private Integer id;

    private String tags;

    private String introduction;

    private Integer playTimes;

    private String title;

    private String pic;

    private Date createTime;

    private Date updateTime;

    private String md5file;

    public Songlist(Integer id, String tags, String introduction, Integer playTimes, String title, String pic, Date createTime, Date updateTime, String md5file) {
        this.id = id;
        this.tags = tags;
        this.introduction = introduction;
        this.playTimes = playTimes;
        this.title = title;
        this.pic = pic;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.md5file = md5file;
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

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getPlayTimes() {
        return playTimes;
    }

    public void setPlayTimes(Integer playTimes) {
        this.playTimes = playTimes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMd5file() {
        return md5file;
    }

    public void setMd5file(String md5file) {
        this.md5file = md5file == null ? null : md5file.trim();
    }
}
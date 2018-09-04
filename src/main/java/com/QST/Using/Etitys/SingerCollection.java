package com.QST.Using.Etitys;

import java.util.Date;

public class SingerCollection {
    private Integer userId;

    private Integer singerId;

    private Date createTime;

    public SingerCollection(Integer userId, Integer singerId, Date createTime) {
        this.userId = userId;
        this.singerId = singerId;
        this.createTime = createTime;
    }

    public SingerCollection() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSingerId() {
        return singerId;
    }

    public void setSingerId(Integer singerId) {
        this.singerId = singerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
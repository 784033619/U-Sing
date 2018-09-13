package com.QST.Using.Etitys;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String introduction;

    private Integer sex;

    private Date birthday;

    private String headimg;

    private String md5file;

    public User(Integer id, String username, String password, String nickname, String introduction, Integer sex, Date birthday, String headimg, String md5file) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.introduction = introduction;
        this.sex = sex;
        this.birthday = birthday;
        this.headimg = headimg;
        this.md5file = md5file;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    public String getMd5file() {
        return md5file;
    }

    public void setMd5file(String md5file) {
        this.md5file = md5file == null ? null : md5file.trim();
    }
}
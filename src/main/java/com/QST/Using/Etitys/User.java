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

    public User(Integer id, String username, String password, String nickname, String introduction, Integer sex, Date birthday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.introduction = introduction;
        this.sex = sex;
        this.birthday = birthday;
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
}
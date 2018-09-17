package com.QST.Using.Etitys;

import zuo.biao.apijson.MethodAccess;
import zuo.biao.apijson.server.Visitor;

import java.util.Date;
import java.util.List;

import static zuo.biao.apijson.RequestRole.ADMIN;
import static zuo.biao.apijson.RequestRole.UNKNOWN;

@MethodAccess(
        POST = {UNKNOWN, ADMIN},
        DELETE = {ADMIN}
)
public class User extends BaseModel implements Visitor {
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private String introduction;

    private Integer sex;

    private Date birthday;

    private String headimg;

    private String md5file;
    private List<Long> contactIdList; //朋友列表

    public User(Long id, String username, String password, String nickname, String introduction, Integer sex, Date birthday, String headimg, String md5file) {
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

    public User(Long id) {
        this.id = id;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    @Override
    public List<Long> getContactIdList() {
        return contactIdList;
    }
    public User setContactIdList(List<Long> contactIdList) {
        this.contactIdList = contactIdList;
        return this;
    }


    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username == null ? null : username.trim();
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password == null ? null : password.trim();
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public User setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
        return this;

    }

    public String getIntroduction() {
        return introduction;
    }

    public User setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
        return this;

    }

    public Integer getSex() {
        return sex;
    }

    public User setSex(Integer sex) {
        this.sex = sex;
        return this;

    }

    public Date getBirthday() {
        return birthday;
    }

    public User setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;

    }

    public String getHeadimg() {
        return headimg;
    }

    public User setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
        return this;

    }

    public String getMd5file() {
        return md5file;
    }

    public User setMd5file(String md5file) {
        this.md5file = md5file == null ? null : md5file.trim();
        return this;

    }
}

package com.QST.Using.Etitys;

public class Singer {
    private Integer id;

    private String name;

    private String introduction;

    private String pic;

    private String md5file;

    public Singer(Integer id, String name, String introduction, String pic, String md5file) {
        this.id = id;
        this.name = name;
        this.introduction = introduction;
        this.pic = pic;
        this.md5file = md5file;
    }

    public Singer() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
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
package com.QST.Using.Etitys;

public class Singer {
    private Integer id;

    private String name;

    private String introduction;

    private String pic;

    public Singer(Integer id, String name, String introduction, String pic) {
        this.id = id;
        this.name = name;
        this.introduction = introduction;
        this.pic = pic;
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
}
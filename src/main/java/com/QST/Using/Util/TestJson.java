package com.QST.Using.Util;

public class TestJson {
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TestJson{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

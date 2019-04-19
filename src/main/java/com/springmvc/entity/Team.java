package com.springmvc.entity;

public class Team {
    private Integer id;

    private String tname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public  String toString(){
        return "Team:{" +
                "id=" +id+
                ",tname="+tname+
                "}";
    }
}
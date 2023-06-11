package com.example.admin_proj;

public class Event {

    private String theme;
    private String desc;
    private String org;
    private String time;

    public Event(){}

    public Event(String theme, String desc, String org, String time) {
        this.theme = theme;
        this.desc = desc;
        this.org = org;
        this.time = time;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

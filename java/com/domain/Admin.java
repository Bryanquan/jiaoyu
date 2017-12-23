package com.domain;

import org.springframework.beans.factory.annotation.Required;

public class Admin {

    private Integer id;

    private String useraccount;

    private String username;

    private String userpwd;

    private String jurisdiction;

    private Integer status;

    private Integer using;

    private Integer level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUseraccount() {
        return useraccount;
    }

    @Required
    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }

    public String getUsername() {
        return username;
    }


    @Required
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }


    @Required
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUsing() {
        return using;
    }

    public void setUsing(Integer using) {
        this.using = using;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Admin() {
    }
}

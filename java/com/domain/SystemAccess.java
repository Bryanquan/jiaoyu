package com.domain;
public class SystemAccess {
    private Integer id;
    private String  sys_time;
    private String  sys_url;
    private Integer order;
    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSys_time() {
        return sys_time;
    }

    public void setSys_time(String sys_time) {
        this.sys_time = sys_time;
    }

    public String getSys_url() {
        return sys_url;
    }

    public void setSys_url(String sys_url) {
        this.sys_url = sys_url;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public SystemAccess() {
    }
}

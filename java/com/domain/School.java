package com.domain;

import org.springframework.beans.factory.annotation.Required;

public class School {


    private Integer sc_code;
    private String  sc_name;
    private Integer id;
    private String  sc_address;
    private Integer sc_pici;
    private Integer sc_wenli;
    private String  sc_site;
    private Integer sc_category;
    private Integer sc_kind;
    private Integer sc_tag;
    private Integer sc_belong;
    private Integer sc_belongtag;
    private Integer sc_property;
    private String  major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getSc_code() {
        return sc_code;
    }

    @Required
    public void setSc_code(Integer sc_code) {
        this.sc_code = sc_code;
    }



    public Integer getSc_category() {
        return sc_category;
    }

    public void setSc_category(Integer sc_category) {
        this.sc_category = sc_category;
    }

    public Integer getSc_kind() {
        return sc_kind;
    }

    public void setSc_kind(Integer sc_kind) {
        this.sc_kind = sc_kind;
    }

    public Integer getSc_tag() {
        return sc_tag;
    }

    public void setSc_tag(Integer sc_tag) {
        this.sc_tag = sc_tag;
    }

    public Integer getSc_belong() {
        return sc_belong;
    }

    public void setSc_belong(Integer sc_belong) {
        this.sc_belong = sc_belong;
    }

    public Integer getSc_belongtag() {
        return sc_belongtag;
    }

    public void setSc_belongtag(Integer sc_belongtag) {
        this.sc_belongtag = sc_belongtag;
    }

    public Integer getSc_property() {
        return sc_property;
    }

    public void setSc_property(Integer sc_property) {
        this.sc_property = sc_property;
    }

    public String getSc_name() {
        return sc_name;
    }

    @Required
    public void setSc_name(String sc_name) {
        this.sc_name = sc_name;
    }

    public String getSc_address() {
        return sc_address;
    }

    public void setSc_address(String sc_address) {
        this.sc_address = sc_address;
    }

    public String getSc_site() {
        return sc_site;
    }

    public void setSc_site(String sc_site) {
        this.sc_site = sc_site;
    }

    public Integer getSc_pici() {
        return sc_pici;
    }

    public void setSc_pici(Integer sc_pici) {
        this.sc_pici = sc_pici;
    }

    public Integer getSc_wenli() {
        return sc_wenli;
    }

    public void setSc_wenli(Integer sc_wenli) {
        this.sc_wenli = sc_wenli;
    }

    public School() {
    }
}

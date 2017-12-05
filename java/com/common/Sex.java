package com.common;

public enum Sex {
    MALE("M"), FEMALE("F");

    private Sex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }
    private String sex;

}
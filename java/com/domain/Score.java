package com.domain;

import java.math.BigDecimal;

/**
 * 持久化类用到集合只能用接口类型
 * 不能用实现类
 */
public class Score {
    private Integer id;
    private String  major;
    private String  school;
    private Integer YearNum;
    private BigDecimal  lq_minScore;
    private BigDecimal  lq_maxScore;
    private BigDecimal  lq_averScore;
    private Integer  wenli;
    private Integer  pici;
    private Integer  planNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getYearNum() {
        return YearNum;
    }

    public void setYearNum(Integer yearNum) {
        this.YearNum = yearNum;
    }

    public BigDecimal getLq_minScore() {
        return lq_minScore;
    }

    public void setLq_minScore(BigDecimal lq_minScore) {
        this.lq_minScore = lq_minScore;
    }

    public BigDecimal getLq_maxScore() {
        return lq_maxScore;
    }

    public void setLq_maxScore(BigDecimal lq_maxScore) {
        this.lq_maxScore = lq_maxScore;
    }

    public BigDecimal getLq_averScore() {
        return lq_averScore;
    }

    public void setLq_averScore(BigDecimal lq_averScore) {
        this.lq_averScore = lq_averScore;
    }

    public Integer getWenli() {
        return wenli;
    }

    public void setWenli(Integer wenli) {
        this.wenli = wenli;
    }

    public Integer getPici() {
        return pici;
    }

    public void setPici(Integer pici) {
        this.pici = pici;
    }

    public Integer getPlanNum() {
        return planNum;
    }

    public void setPlanNum(Integer planNum) {
        this.planNum = planNum;
    }

    public Score() {
    }
}

package com.service;

import com.core.page.Pagination;
import com.domain.School;

import java.util.List;

public interface SchoolService {
    public School findOne(Integer id);

    public School findByName(School school);

    public List<School> findAll();

    public List<School> displayDefault();

    public Integer getSchoolAmount();

    public void add(School school);

    public void update(School school);

    public void delete(School school);

    public List<School> findBySchool(School school);

    public List<School> findByPageSize(Integer startNum, Integer pageSize);

    public Pagination<School> pagination(Pagination<School> pagination);
}

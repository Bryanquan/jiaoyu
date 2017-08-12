package com.service;

import com.core.page.Pagination;
import com.domain.School;

import java.util.List;

public interface SchoolService
{
    public School getById(Integer id);

    public School getSchoolByName(School school);

    public List<School> list();

    public List<School> displayDefault();

    public Integer getSchoolAmount();

    public void   add(School school);

    public void   update(School school);

    public void   delete(School school);

    public List<School> listBySchool(School school);

    public List<School> listByPageSize(Integer startNum, Integer pageSize);

    public  Pagination<School> pagination(Pagination<School> pagination);
}

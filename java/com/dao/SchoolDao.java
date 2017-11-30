package com.dao;

import com.core.page.Pagination;
import com.domain.School;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolDao {
    public School getById(Integer id);

    public School getSchoolByName(School school);

    public List<School> list();

    public Integer getSchoolAmount();

    public void add(School school);

    public void update(School school);

    public void delete(School school);

    public List<School> listBySchool(School school);

    //分页处理
    public List<School> listByPageSize(Integer startNum, Integer pageSize);

    public List<School> paginationEntity(Pagination<School> pagination);

    public List<School> displayDefault();
}

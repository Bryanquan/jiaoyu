package com.dao;

import com.core.page.Pagination;
import com.domain.School;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolDao {
    public School findOne(Integer id);

    public School findByName(School school);

    public List<School> findAll();

    public Integer getSchoolAmount();

    public void add(School school);

    public void update(School school);

    public void delete(School school);

    public List<School> findBySchool(School school);

    //分页处理
    public List<School> findByPageSize(Integer startNum, Integer pageSize);

    public List<School> paginationEntity(Pagination<School> pagination);

    public List<School> displayDefault();
}

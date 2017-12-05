package com.serviceImpl;

import com.core.page.Pagination;
import com.dao.SchoolDao;
import com.domain.School;
import com.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolDao schooldao;


    public List<School> findBySchool(School school) {
        return schooldao.findBySchool(school);
    }


    public School findOne(Integer id) {
        return schooldao.findOne(id);
    }

    public School findByName(School school) {
        return schooldao.findByName(school);
    }


    public List<School> findAll() {
        return schooldao.findAll();
    }

    public Integer getSchoolAmount() {
        return schooldao.getSchoolAmount();
    }

    public void add(School school) {
        schooldao.add(school);
    }

    public void update(School school) {
        schooldao.update(school);
    }

    public void delete(School school) {
        schooldao.delete(school);
    }

    public Pagination<School> pagination(Pagination<School> pagination) {
        Integer itemsamount = schooldao.getSchoolAmount();
        pagination.setTotalItemsCount(itemsamount);
        List<School> items = schooldao.paginationEntity(pagination);
        pagination.setItems(items);
        return pagination;
    }

    public List<School> findByPageSize(Integer startNum, Integer pageSize) {
        return schooldao.findByPageSize(startNum, pageSize);
    }

    public List<School> displayDefault() {
        return schooldao.displayDefault();
    }
}

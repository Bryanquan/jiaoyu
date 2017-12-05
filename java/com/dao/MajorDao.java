package com.dao;

import com.core.page.Pagination;
import com.domain.Major;
import com.domain.Score;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MajorDao {
    public Major findOne(Integer id);

    public List<Major> findAll();

    public List<Major> paginationEntity(Pagination<Score> pagination);

    public void add(Major major);

    public void delete(Major major);

    public void update(Major major);

    public Integer getScoreAmount();

}

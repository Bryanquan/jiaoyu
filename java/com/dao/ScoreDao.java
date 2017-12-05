package com.dao;

import com.core.page.Pagination;
import com.domain.Score;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface ScoreDao {

    public Score findOne(Integer id);

    public List<Score> findAll();

    public List<Score> paginationEntity(Pagination<Score> pagination);

    public List<Score> findBySchoolAndScore(@Param("params") Map paramMap);

    public Integer getScoreAmount();

    public void add(Score score);

    public void delete(Score score);

    public void update(Score score);

}

package com.service;
import com.core.page.Pagination;
import com.domain.School;
import com.domain.Score;
import java.util.List;
public interface ScoreService {

    public Score getById(Integer id);

    public List<Score> list();

    public Pagination<Score> paginationEntity(Pagination<Score> pagination);

    public Integer getScoreAmount();

    public List<Score> listBySchoolAndScore(Integer pici, Score score, List<Integer> yearNum, School[] schools);

    public void add(Score score);

    public void delete(Score score);

    public void update(Score score);
}

package com.serviceImpl;

import com.core.page.Pagination;
import com.dao.ScoreDao;
import com.domain.School;
import com.domain.Score;
import com.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService{

    @Autowired
    private ScoreDao scoreDao;

    public Score getById(Integer id) {
        return scoreDao.getById(id);
    }

    public List<Score> list() {
        return scoreDao.list();
    }

    public Pagination<Score> paginationEntity(Pagination<Score> pagination) {
        Integer amount=scoreDao.getScoreAmount();
        pagination.setTotalItemsCount(amount);
        List<Score> items=scoreDao.paginationEntity(pagination);
        pagination.setItems(items);
        return pagination;
    }

    public Integer getScoreAmount() {
        return scoreDao.getScoreAmount();
    }

    /**
     * 多个参数封装成map对象
     * @param pici
     * @param score
     * @param yearNum
     * @param schools
     * @return
     */
    public List<Score> listBySchoolAndScore(Integer pici, Score score, List<Integer> yearNum,School[]  schools){
        HashMap paraMap=new HashMap();
        paraMap.put("pici",pici);
        paraMap.put("score",score);
        paraMap.put("yearNum",yearNum);
        paraMap.put("schools",schools);
        return scoreDao.listBySchoolAndScore(paraMap);
    }

    public void add(Score score) {
        scoreDao.add(score);
    }

    public void delete(Score score) {
       scoreDao.delete(score);
    }

    public void update(Score score) {
       scoreDao.update(score);
    }
}

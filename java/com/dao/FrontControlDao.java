package com.dao;

import com.core.page.Pagination;
import com.domain.FrontControl;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FrontControlDao {
    public FrontControl findOne(Integer id);

    public FrontControl findByPid(Integer pid);

    //查找pid为空主条目
    public List<FrontControl> findById();

    //查找pid不为空的附属条目
    public List<FrontControl> findByPid();

    public List<FrontControl> findAll();

    public FrontControl findByTitle(String title);

    public Integer getFrontControlAmount();

    /**
     * 两个分页处理方法
     *
     * @param startNum
     * @param pageSize
     * @pagination
     */
    public List<FrontControl> listByPageSize(Integer startNum, Integer pageSize);

    public List<FrontControl> paginationEntity(Pagination<FrontControl> pagination);

    public void add(FrontControl frontControl);

    public void delete(FrontControl frontControl);

    public void update(FrontControl frontControl);
}


package com.service;

import com.core.page.Pagination;
import com.domain.FrontControl;

import java.util.List;

public interface FrontControlService {
    public FrontControl findOne(Integer id);

    //查找pid为空主条目
    public List<FrontControl> findById();

    public FrontControl findByTitle(String title);

    //查找pid不为空的附属条目
    public List<FrontControl> findByPid();

    public List<FrontControl> findAll();

    /**
     * 两个分页处理方法
     *
     * @param startNum
     * @param pageSize
     * @return
     */
    public List<FrontControl> findByPageSize(Integer startNum, Integer pageSize);

    public Pagination<FrontControl> pagination(Pagination<FrontControl> pagination);

    public void add(FrontControl frontControl);

    public void delete(FrontControl frontControl);

    public void update(FrontControl frontControl);
}

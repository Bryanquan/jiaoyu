package com.dao;

import com.core.page.Pagination;
import com.domain.FrontControl;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FrontControlDao {
    public FrontControl getById(Integer id);

    public FrontControl getByPid(Integer pid);

    //查找pid为空主条目
    public List<FrontControl> listById();

    //查找pid不为空的附属条目
    public List<FrontControl> listByPid();

    public List<FrontControl> list();

    public FrontControl getByTitle(String title);

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


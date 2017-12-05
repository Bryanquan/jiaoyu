package com.dao;

import com.core.page.Pagination;
import com.domain.Vip;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VipDao {
    public Vip findOne(Integer id);

    public Vip findByUsername(String usernname);

    public List<Vip> findByPage(Integer startNum, Integer pageSize);

    public List<Vip> paginationEntity(Pagination<Vip> pagination);

    public List<Vip> findAll();

    public Integer getVipAmount();

    public void add(Vip vip);

    public void delete(Vip vip);

    public void update(Vip vip);
}

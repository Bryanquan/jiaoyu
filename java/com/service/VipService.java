package com.service;

import com.core.page.Pagination;
import com.domain.Vip;

import java.util.List;

public interface VipService {
    public Vip findOne(Integer id);

    public Vip getByUsername(String usernname);

    public Pagination<Vip> paginationEntity(Pagination<Vip> pagination);

    public List<Vip> findByPage(Integer startNum, Integer pageSize);

    public List<Vip> findAll();

    public Integer getVipAmount();

    public void add(Vip vip);

    public void delete(Vip vip);

    public void update(Vip vip);
}

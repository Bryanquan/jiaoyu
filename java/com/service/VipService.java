package com.service;

import com.core.page.Pagination;
import com.domain.Vip;

import java.util.List;

public interface VipService
{
    public Vip getById(Integer id);

    public Vip getByUsername(String usernname);

    public Pagination<Vip> paginationEntity(Pagination<Vip> pagination);

    public List<Vip> listByPage(Integer startNum, Integer pageSize);

    public List<Vip> list();

    public Integer getVipAmount();

    public void    add(Vip vip);

    public void    delete(Vip vip);

    public void    update(Vip vip);
}

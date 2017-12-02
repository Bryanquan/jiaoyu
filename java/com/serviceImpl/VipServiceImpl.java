package com.serviceImpl;

import com.core.page.Pagination;
import com.dao.VipDao;
import com.domain.Vip;
import com.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipServiceImpl implements VipService {
    @Autowired
    private VipDao vipDao;

    public Vip getById(Integer id) {
        return vipDao.findOne(id);
    }

    public Vip getByUsername(String usernname) {
        return vipDao.findByUsername(usernname);
    }

    public List<Vip> listByPage(Integer startNum, Integer pageSize) {
        return vipDao.listByPage(startNum, pageSize);
    }

    public List<Vip> list() {
        return vipDao.list();
    }

    public Integer getVipAmount() {
        return vipDao.getVipAmount();
    }

    public void add(Vip vip) {
        vipDao.add(vip);
    }

    public void delete(Vip vip) {
        vipDao.delete(vip);
    }

    public Pagination<Vip> paginationEntity(Pagination<Vip> pagination) {
        Integer amount = vipDao.getVipAmount();
        List<Vip> items = vipDao.paginationEntity(pagination);
        pagination.setTotalItemsCount(amount);
        pagination.setItems(items);
        return pagination;
    }

    public void update(Vip vip) {
        vipDao.update(vip);
    }
}

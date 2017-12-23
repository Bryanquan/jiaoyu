package com.serviceImpl;

import com.core.page.Pagination;
import com.dao.AdminDao;
import com.domain.Admin;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    public Admin findOne(Integer id) {
        return adminDao.findOne(id);
    }


    public Admin findByUsername(String username) {
        return adminDao.findByUsername(username);
    }


    public Admin findOne(String id) {
        return adminDao.findOne(id);
    }


    public List<Admin> findAll() {
        return adminDao.findAll();
    }


    public Integer getAdminAmount() {
        return adminDao.getAdminAmount();
    }


    public Pagination<Admin> paginationEntity(Pagination<Admin> pagination) {
        Integer amount = adminDao.getAdminAmount();
        List<Admin> items = adminDao.paginationEntity(pagination);
        pagination.setItems(items);
        pagination.setTotalItemsCount(amount);
        return pagination;
    }


    public Admin findByUseraccount(String useraccount) {
        return adminDao.findByUserAccount(useraccount);
    }

    public void add(Admin admin) {
        adminDao.add(admin);
    }


    public void update(Admin admin) {
        adminDao.update(admin);
    }


    public void delete(Admin admin) {
        adminDao.delete(admin);
    }

    public void updatePassword(Admin admin) {
        adminDao.updatePassword(admin);
    }

}

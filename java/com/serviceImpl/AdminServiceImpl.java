package com.serviceImpl;

import com.core.page.Pagination;
import com.dao.AdminDao;
import com.domain.Admin;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminDao adminDao;

    public Admin getById(Integer id) {
        return adminDao.getById(id);
    }


    public Admin getByName(String username) {
        return adminDao.getByName(username);
    }



    public Admin getById(String id) {
        return adminDao.getById(id);
    }


    public List<Admin> list() {
        return adminDao.list();
    }


    public Integer getAdminAmount() {
        return adminDao.getAdminAmount();
    }


    public Pagination<Admin> paginationEntity(Pagination<Admin> pagination) {
        Integer amount=adminDao.getAdminAmount();
        List<Admin> items=adminDao.paginationEntity(pagination);
        pagination.setItems(items);
        pagination.setTotalItemsCount(amount);
        return pagination;
    }


    public Admin getByUseraccount(String useraccount) {
        return adminDao.getByUseraccount(useraccount);
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
}

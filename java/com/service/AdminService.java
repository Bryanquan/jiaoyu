package com.service;

import com.core.page.Pagination;
import com.domain.Admin;

import java.util.List;

public interface AdminService {

    Admin findOne(String id);

    List<Admin> findAll();

    Admin findOne(Integer id);

    Admin findByUsername(String username);

    Integer getAdminAmount();

    Pagination<Admin> paginationEntity(Pagination<Admin> pagination);

    Admin findByUseraccount(String useraccount);

    void add(Admin admin);

    void update(Admin admin);

    void delete(Admin admin);

    void updatePassword(Admin admin);
}

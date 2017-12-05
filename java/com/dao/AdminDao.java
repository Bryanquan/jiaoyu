package com.dao;

import com.core.page.Pagination;
import com.domain.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminDao {

    Admin findOne(String id);

    Admin findOne(Integer id);

    Admin findByName(String username);

    List<Admin> findAll();

    Integer getAdminAmount();

    List<Admin> paginationEntity(Pagination<Admin> pagination);

    Admin findByUserAccount(String useraccount);

    void add(Admin admin);

    void update(Admin admin);

    void delete(Admin admin);


}

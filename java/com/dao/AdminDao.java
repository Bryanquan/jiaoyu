package com.dao;

import com.core.page.Pagination;
import com.domain.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminDao {

    Admin getById(String id);

    Admin getById(Integer id);

    Admin getByName(String username);

    List<Admin> list();

    Integer getAdminAmount();

    List<Admin> paginationEntity(Pagination<Admin> pagination);

    Admin getByUseraccount(String useraccount);

    void add(Admin admin);

    void update(Admin admin);

    void delete(Admin admin);


}

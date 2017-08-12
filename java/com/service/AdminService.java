package com.service;
import com.core.page.Pagination;
import com.domain.Admin;

import java.util.List;

public interface AdminService {

     Admin getById(String id);

    List<Admin> list();

    Admin   getById(Integer id);

    Admin    getByName(String username);

    Integer getAdminAmount();

    Pagination<Admin>  paginationEntity(Pagination<Admin> pagination);

    Admin getByUseraccount(String useraccount);

    void  add(Admin admin);

   void  update(Admin admin);

   void  delete(Admin admin);
}

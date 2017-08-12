package com.controller;

import com.domain.Admin;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String update(@PathVariable Integer id, HttpServletRequest request, Admin admin) {
        admin.setId(id);
        adminService.update(admin);
        return "Admin/admin/list";
    }

}

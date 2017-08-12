package com.controller;

import com.core.page.Pagination;
import com.domain.School;
import com.service.SchoolService;
import com.util.CommonUtil;
import com.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

@Controller
@RequestMapping(value = "/School")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "/list")
    public String list(ModelMap mv, HttpServletRequest request) {
        if (!SessionUtil.isLogin(request)) {
            return "redirect:/login.jsp";
        }
        Integer pageSize = Integer.valueOf(request.getParameter("pageSize"));
        Integer pageNum = Integer.valueOf(request.getParameter("pageNum"));
        Pagination<School> pagination = new Pagination<School>();
        pagination.setPageSize(pageSize);
        pagination.setPageNum(pageNum);
        Integer start = (pageNum - 1) * pageSize;
        pagination.setStart(start);
        mv.addAttribute("school", schoolService.pagination(pagination));
        mv.addAttribute("amount", schoolService.getSchoolAmount());
        return "Admin/School/list";
    }

    @RequestMapping(value = "/add")
    public String add(School school, HttpServletRequest request) {

        if (!SessionUtil.isLogin(request)) {
            return "redirect:/login.jsp";
        }
        if (!CommonUtil.isNull(schoolService.getSchoolByName(school))) {
            return "Admin/School/list";
        }
        schoolService.add(school);
        return "Admin/School/list";
    }

    @RequestMapping(value = "/delete")
    public ModelAndView delete(School school) {
        ModelAndView mv = new ModelAndView("Admin/School/list");
        if (school.getId() != null) {
            schoolService.delete(school);
        } else {
            return mv;
        }
        return mv;
    }

    @RequestMapping(value = "/update")
    public String update(School school) {
        if (school.getId() != null) {
            schoolService.update(school);
        } else {
            return "Admin/School/list";
        }
        return "Admin/School/list";
    }

    //上传excel表格
    @RequestMapping(value = "/upload")
    public String upload(@RequestParam("schoolfile") CommonsMultipartFile file, HttpServletRequest request)
            throws IOException {
        String path = request.getRealPath("/fileupload");
        InputStream in = file.getInputStream();
        OutputStream os = new FileOutputStream(new File(path, file.getOriginalFilename()));
        int len = 0;
        byte[] buffer = new byte[400];
        while ((len = in.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        in.close();
        os.close();
        return "Admin/School/list";
    }

    //assign all the values for condition
    @RequestMapping(value = "/transfercondition")
    public String tranfercondition(ModelMap map) {
        return null;
    }

    @RequestMapping(value = "/page")
    public String page(ModelMap map, HttpServletRequest request) {
        Pagination pagination = new Pagination();
        Integer pageNum = Integer.parseInt(request.getParameter("pageNum"));
        if (CommonUtil.isNull(request.getParameter("pageSize"))) {
            pagination.setStart(0);
        } else {
            Integer pageSize = Integer.parseInt(request.getParameter("pageSize"));
            Integer start = (pageNum - 1) * pageSize;
            pagination.setStart(start);
        }
        pagination.setPageNum(pageNum);
        Pagination<School> schools = schoolService.pagination(pagination);
        List<School> schoolList = schools.getItems();
        map.addAttribute("schoolList", schoolList);
        return "/Home/School/list";
    }
}

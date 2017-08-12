package com.controller;

import com.domain.Dict;
import com.domain.FrontControl;
import com.domain.School;
import com.service.DictService;
import com.service.FrontControlService;
import com.service.SchoolService;
import com.util.CommonUtil;
import com.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/FrontControl")
public class FrontControlController {

    @Autowired
    private FrontControlService controlService;

    @Autowired
    private DictService dictService;

    @Autowired
    private SchoolService schoolService;

    //主附属条目处理方法

    @RequestMapping(value = "/LeftFrame")
    public String listById(ModelMap map, HttpServletRequest request) {
        if (!SessionUtil.isLogin(request)) {
            return "redirect:/login.jsp";
        }
        List<FrontControl> mainlist = controlService.listById();
        List<FrontControl> sonlist = controlService.listByPid();
        map.addAttribute("mainlist", mainlist);
        map.addAttribute("sonlist", sonlist);
        return "Home/Vip/left";
    }

    @RequestMapping(value = "/RightFrame")
    public String RightFrame(HttpServletRequest request) {
        if (!SessionUtil.isLogin(request)) {
            return "redirect:/login.jsp";
        }
        return "Home/Vip/right";
    }

    @RequestMapping(value = "/getBySchool_info")
    public String getBySchool_info(HttpServletRequest request, ModelMap map) {
        if (!SessionUtil.isLogin(request)) {
            return "redirect:/login.jsp";
        }
        List<Dict> sc_belong = dictService.getscbelong();
        List<Dict> sc_kind = dictService.getsckind();
        List<Dict> sc_category = dictService.getsccategory();
        List<Dict> sc_property = dictService.getscproperty();
        List<Dict> sc_pic = dictService.getpici();
        map.addAttribute("sc_belong", dictService.getscbelong());
        map.addAttribute("sc_category", sc_category);
        map.addAttribute("sc_kind", sc_kind);
        map.addAttribute("sc_property", sc_property);
        map.addAttribute("sc_pici", sc_pic);
        return "/Home/School/list";
        //return "redirect:/pages/Home/School/list.jsp";
    }

    @RequestMapping(value = "/getMajor_info")
    public String getMajor_info(HttpServletRequest request) {
        if (!SessionUtil.isLogin(request)) {
            return "redirect:/login.jsp";
        }
        return "redirect:/School/list.do";
    }

    @RequestMapping(value = "/gettoudangxian_info")
    public String gettoudangxian_info(HttpServletRequest request) {
        if (!SessionUtil.isLogin(request)) {
            return "redirect:/login.jsp";
        }
        return "redirect:/School/list.do";
    }

    @RequestMapping(value = "/ShowSchool_info")
    public String ShowSchool_info(ModelMap map, HttpServletRequest request) {
        if (!SessionUtil.isLogin(request)) {
            return "redirect:/login.jsp";
        }
        List<Dict> sc_belong = dictService.getscbelong();
        List<Dict> sc_category = dictService.getsccategory();
        List<Dict> sc_kind = dictService.getsckind();
        List<Dict> sc_property = dictService.getscproperty();
        List<Dict> sc_pici = dictService.getpici();
        List<Dict> sc_belongTag=dictService.getSchoolBelongTag();
        List<School> schools=schoolService.displayDefault();
        map.addAttribute("sc_belong", sc_belong);
        map.addAttribute("sc_category", sc_category);
        map.addAttribute("sc_kind", sc_kind);
        map.addAttribute("sc_property", sc_property);
        map.addAttribute("sc_pici", sc_pici);
        map.addAttribute("sc_belongtag",sc_belongTag);
        map.addAttribute("schools",schools);
        return "Home/School/list";

    }

    @RequestMapping(value = "/ShowMajor_info")
    public String ShowMajor_info(HttpServletRequest request) {
        if (!SessionUtil.isLogin(request)) {
            return "redirect:/login.jsp";
        }
        return "redirect:/pages/Home/School/list.jsp";
    }

    @RequestMapping(value = "/add")
    public String add(FrontControl frontControl, HttpServletRequest request) {
        if (!SessionUtil.isLogin(request)) {
            return "redirect:/login.jsp";
        }
        Integer pid = Integer.valueOf(request.getParameter("pid"));
        Integer status = Integer.valueOf(request.getParameter("status"));
        frontControl.setPid(pid);
        //判断有无重复title属性的记录
        if (!CommonUtil.isNull(controlService.getByTitle(frontControl.getTitle()))) {
            return "Admin/FrontControl/list";
        } else {
            controlService.add(frontControl);
            return "Admin/FrontControl/list";
        }
    }

    @RequestMapping(value = "/delete")
    public String delete(FrontControl frontControl, HttpServletRequest request) {
        Integer id = Integer.valueOf(request.getParameter("id"));
        frontControl.setId(id);
        controlService.update(frontControl);
        return "Admin/FrontControl/list";
    }

}

package com.controller;

import com.domain.Vip;
import com.service.VipService;
import com.util.CommonUtil;
import com.util.Md5Util;
import com.util.SessionUser;
import com.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/Vip")
public class VipController {
    @Autowired
    private VipService vipService;

    @RequestMapping(value = "/login", method = RequestMethod.POST )
    public String login(String name, String userpwd, HttpServletRequest request)
            throws IOException {
        String username = name;
        Vip vip = vipService.findByUsername(username);
        userpwd = Md5Util.md5(userpwd);
        /**
         *open the session
         */
        HttpSession session = request.getSession();
        SessionUser sessionUser = new SessionUser();
        sessionUser.setId(session.getId());
        if (CommonUtil.isNotNull(vip) && vip.getUserpwd().equals(userpwd)) {
            sessionUser.setLoginname(vip.getTruename());
            sessionUser.setLoginpwd(vip.getUserpwd());
            SessionUtil.setSessionUser(request, sessionUser);
            return "Home/Vip/main";
        } else {
            return "redirect:/login.jsp";
        }
    }

    @RequestMapping(value = "/loginout", method = RequestMethod.GET)
    public String loginout(HttpServletRequest request) {
        SessionUtil.removeSessionUser(request);
        return "redirect:/login.jsp";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Vip vip, HttpServletRequest request) {

        if (!SessionUtil.isLogin(request)) {
            return "redirect:/login.jsp";
        }
        //查找数据库里面是否有相同用户名的用户
        //不允许添加相同用户名的用户
        if (CommonUtil.isNull(vipService.findByUsername(vip.getUsername()))) {
            return "Admin/Vip/list";
        }
        String userpwd = Md5Util.md5(vip.getUserpwd());
        vip.setUserpwd(userpwd);
        vipService.add(vip);
        return "Admin/Vip/list";

    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String delete(String Id, Vip vip, HttpServletRequest request) {
        if (!SessionUtil.isLogin(request)) {
            return "redirect:/login.jsp";
        }
        Integer id = Integer.parseInt(Id);
        vip.setId(id);
        vipService.delete(vip);
        return "Admin/Vip/list";
    }

    @RequestMapping(value = "/update", method = RequestMethod.PATCH)
    public String update(String Id, Vip vip, HttpServletRequest request) {
        if (!SessionUtil.isLogin(request)) {
            return "redirect:/login.jsp";
        }
        Integer id = Integer.parseInt(Id);
        String pwd = Md5Util.md5(vip.getUserpwd());
        vip.setUserpwd(pwd);
        vip.setId(id);
        vipService.update(vip);
        return "Admin/Vip/list";
    }
}

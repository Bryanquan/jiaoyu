package com.util;

import javax.servlet.http.HttpServletRequest;

/**
 * session util class
 *
 * @author bryan quan
 */
public class SessionUtil {
    private static String SESSION_USER_KEY = "_session_user";

    public static void setSessionUser(HttpServletRequest request, SessionUser su) {
        request.getSession().setAttribute(SESSION_USER_KEY, su);
    }

    public static SessionUser getSessionUser(HttpServletRequest request) {
        System.out.println("用户身份信息ID：" + request.getSession().getId());
        if (request.getSession().getAttribute(SESSION_USER_KEY) != null) {
            return (SessionUser) request.getSession().getAttribute(SESSION_USER_KEY);
        }
        return null;
    }

    public static void removeSessionUser(HttpServletRequest request) {
        request.getSession().removeAttribute(SESSION_USER_KEY);
    }


    public static boolean isLogin(HttpServletRequest request) {
        return getSessionUser(request) != null;
    }

}

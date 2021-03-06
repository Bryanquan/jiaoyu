package com.util;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * http工具类
 *
 * @author bryan quan
 */
public class HttpUtil extends WebUtils {

    /**
     * 获取域名
     */
    public static String getDomain(HttpServletRequest request) {
        return request.getServerName();
    }

    //获取项目详细的url地址
    public static String getHttpDomain(HttpServletRequest request) {
        return request.getScheme() + "://" + request.getServerName();
    }

    //获取项目详细的url地址
    public static String getContextHttpUri(HttpServletRequest request) {
        return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
    }

    public static String getRealPath(HttpServletRequest request) {
        return request.getSession().getServletContext().getRealPath("/");
    }

    public static String getRequestFullUri(HttpServletRequest request) {
        String port = "";
        if (request.getServerPort() != 80) {
            port = ":" + request.getServerPort();
        }
        return request.getScheme() + "://" + request.getServerName() + port + request.getContextPath() + request.getServletPath();
    }

    public static String getRequestFullUriNoContextPath(HttpServletRequest request) {
        String port = "";
        if (request.getServerPort() != 80) {
            port = ":" + request.getServerPort();
        }
        return request.getScheme() + "://" + request.getServerName() + port + request.getServletPath();
    }

    //获取ip地址；
    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
            if (ip.contains("::ffff:")) {
                ip = ip.replace("::ffff:", "");
            }

            int index = ip.indexOf(",");
            if (index != -1) {
                return ip.substring(0, index);
            } else {
                return ip;
            }
        }
        ip = request.getHeader("X-Real-IP");
        if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
            return ip;
        }
        return request.getRemoteAddr();
    }

    //判断当前请求是否为Ajax
    public static boolean isAjaxRequest(HttpServletRequest request) {
        String header = request.getHeader("X-Requested-With");
        return !StringUtils.isEmpty(header) && "XMLHttpRequest".equals(header);
    }

    /**
     * 重定向
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param url
     */
    public static void redirectUrl(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String url) {
        try {
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 重定向到http://的url
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param url
     */
    public static void redirectHttpUrl(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String url) {
        try {
            httpServletResponse.sendRedirect(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

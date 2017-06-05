package com.elder.util.session;

import com.elder.util.exception.SessionNotExistException;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionUtils {

    private static HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    /**
     * 获取当前session对对象
     *
     * @return
     */
    public static HttpSession getSession() {
        HttpSession httpSession = getRequest().getSession();
        if (httpSession == null) {
            throw new SessionNotExistException();
        }
        return httpSession;
    }

    /**
     * 绑定当前用户与标识到session对象中
     *
     * @param str
     * @param obj
     */
    public static void bindSession(String str, Object obj) {
        getSession().setAttribute(str, obj);
    }

    /**
     * 退出时将session的值设置为空
     *
     * @param str
     */
    public static void logOutSession(String str) {
        getSession().setAttribute(str, null);
    }
    public static String getCurrentPath(){
        return getSession().getServletContext().getRealPath("/");
    }
}

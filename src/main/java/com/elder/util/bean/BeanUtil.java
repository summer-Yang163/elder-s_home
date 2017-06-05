package com.elder.util.bean;

import com.elder.util.session.SessionUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


public class BeanUtil {
    private static ApplicationContext applicationContext;

    public static Object load(String name) {
        if (applicationContext == null) {
            applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(SessionUtils.getSession().getServletContext());
        }
        return applicationContext.getBean(name);
    }

}

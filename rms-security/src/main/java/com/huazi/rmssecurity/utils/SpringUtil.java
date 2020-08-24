package com.huazi.rmssecurity.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;

public class SpringUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext = null;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringUtil.applicationContext = applicationContext;
    }

    public static <T> T getBean(Class<T> cla){
        return applicationContext.getBean(cla);
    }
    public static <T> T getBean(String name,Class<T> cla){
        return applicationContext.getBean(name, cla);
    }
    public static String getBean(String key){
        return applicationContext.getBean(Environment.class).getProperty(key);
    }
}

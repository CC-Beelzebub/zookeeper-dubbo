package com.cc.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by lenovo on 2018/3/13.
 */
public class BeanFactoryUtil {
    private static ApplicationContext ctx_producer = null;

    public final static String ApplicationContextRoot = "";
    public final static String ApplicationContextPath = ApplicationContextRoot + "applicationContext.xml";

    public static void init() {
        if (ctx_producer == null) {
            synchronized (BeanFactoryUtil.class) {
                if(ctx_producer == null){
                    String[] configLocations = new String[]{ApplicationContextPath};
                    ctx_producer = new ClassPathXmlApplicationContext(configLocations);
                }
            }
        }
    }

    public static ApplicationContext getContext() {
        init();
        return ctx_producer;
    }
}

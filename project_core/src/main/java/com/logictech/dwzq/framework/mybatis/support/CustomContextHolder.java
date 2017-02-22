package com.logictech.dwzq.framework.mybatis.support;

/**
 * <b>function:</b> 多数据源
 * @file CustomerContextHolder.java
 */
public abstract class CustomContextHolder {
 
    public final static String SESSION_FACTORY_MYSQL = "mysql";
    
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();  
    
    public static void setContextType(String contextType) {  
        contextHolder.set(contextType);  
    }
      
    public static String getContextType() {  
        return contextHolder.get();  
    }  
      
    public static void clearContextType() {  
        contextHolder.remove();  
    }  
}
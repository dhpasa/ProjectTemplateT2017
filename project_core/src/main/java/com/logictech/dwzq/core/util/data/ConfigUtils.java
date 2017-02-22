package com.logictech.dwzq.core.util.data;

import java.text.MessageFormat;
import java.util.ResourceBundle;

import com.logictech.dwzq.core.util.BaseUtils;

/**
 * 配置文件获取工具类
 * @date 2012-7-06
 * @author JiangZhixing
 * @version V0.1
 * @brief
 * @since 0.1
 */
public class ConfigUtils extends BaseUtils {
	
	/**
     * Message 格式化工具
     */
    final static MessageFormat FORMAT = new MessageFormat("");

    /**
     * 获取系统配置文件
     * @param key
     * @return
     */
    public static String getSysConfig(String key) {
    	ResourceBundle rb = ResourceBundle.getBundle("system");
        return rb.getString(key);
    }
    
    /**
     * 单一参数的Message
     * 
     * @param key message key
     * @param arg0 参数1
     * @return Message内容
     */
    public static String getSysConfig(String key, String arg0) {
        String mes = getSysConfig(key);
        FORMAT.applyPattern(mes);
        return FORMAT.format(new String[] { arg0 });
    }
    
    /**
     * 两个参数的Message
     * 
     * @param key message key
     * @param arg0 参数1
     * @param arg1 参数2
     * @return Message内容
     */
    public static String getSysConfig(String key, String arg0, String arg1) {
        String mes = getSysConfig(key);
        FORMAT.applyPattern(mes);
        return FORMAT.format(new String[] { arg0, arg1 });
    }
    
    /**
     * 三个参数的Message
     * 
     * @param key message key
     * @param arg0 参数1
     * @param arg1 参数2
     * @param arg2 参数3
     * @return Message内容
     */
    public static String getSysConfig(String key, String arg0, String arg1, String arg2) {
        String mes = getSysConfig(key);
        FORMAT.applyPattern(mes);
        return FORMAT.format(new String[] { arg0, arg1, arg2 });
    }

}

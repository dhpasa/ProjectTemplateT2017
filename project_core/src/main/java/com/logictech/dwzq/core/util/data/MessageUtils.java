package com.logictech.dwzq.core.util.data;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import com.logictech.dwzq.core.util.BaseUtils;

public class MessageUtils extends BaseUtils {

    /**
     * message cache
     */
    public static Map<String, String> messageMap = new HashMap<String, String>();

    /**
     * 静态加载message内容
     */
    static {
        //加载共通Message
        ResourceBundle rb = ResourceBundle.getBundle("language/message");
        Set<String> keySet = rb.keySet();
        for (String keyStr : keySet) {
            messageMap.put(keyStr, rb.getString(keyStr));
        }
        //加载业务Message
//        ResourceBundle rb2 = ResourceBundle.getBundle("bizMessage");
//        Set<String> keySet2 = rb2.keySet();
//        for (String keyStr : keySet2) {
//            messageMap.put(keyStr, rb2.getString(keyStr));
//        }
    }

    /**
     * Message 格式化工具
     */
    final static MessageFormat FORMAT = new MessageFormat("");

    /**
     * 获取无参数的Message
     * 
     * @param key message key
     * @return 无参数的Message
     */
    public static String getText(String key) {
        return messageMap.get(key);
    }

    /**
     * 单一参数的Message
     * 
     * @param key message key
     * @param arg0 参数1
     * @return Message内容
     */
    public static String getText(String key, String arg0) {
        String mes = messageMap.get(key);
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
    public static String getText(String key, String arg0, String arg1) {
        String mes = messageMap.get(key);
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
    public static String getText(String key, String arg0, String arg1, String arg2) {
        String mes = messageMap.get(key);
        FORMAT.applyPattern(mes);
        return FORMAT.format(new String[] { arg0, arg1, arg2 });
    }

    /**
     * 四个参数的Message
     * 
     * @param key message key
     * @param arg0 参数1
     * @param arg1 参数2
     * @param arg2 参数3
     * @param arg3 参数4
     * @return Message内容
     */
    public static String getText(String key, String arg0, String arg1, String arg2, String arg3) {
        String mes = messageMap.get(key);
        FORMAT.applyPattern(mes);
        return FORMAT.format(new String[] { arg0, arg1, arg2, arg3 });
    }

    /**
     * 五个参数的Message
     * 
     * @param key message key
     * @param arg0 参数1
     * @param arg1 参数2
     * @param arg2 参数3
     * @param arg3 参数4
     * @param arg4 参数5
     * @return Message内容
     */
    public static String getText(String key, String arg0, String arg1, String arg2, String arg3, String arg4) {
        String mes = messageMap.get(key);
        FORMAT.applyPattern(mes);
        return FORMAT.format(new String[] { arg0, arg1, arg2, arg3, arg4 });
    }

    /**
     * 多个参数的Message
     * 
     * @param key message key
     * @param arg0 参数数组
     * @return Message内容
     */
    public static String getText(String key, String[] arg0) {
        if (arg0 == null || arg0.length == 0) {
            return getText(key);
        } else {
            String mes = messageMap.get(key);
            FORMAT.applyPattern(mes);
            return FORMAT.format(arg0);
        }
    }

    //	/**
    //	 * 多个参数的Message
    //	 * @param key
    //	 * @param arg0
    //	 * @return
    //	 */
    //	public static String getText(String key,List<Object> arg0){
    //		String mes = messageMap.get(key);
    //		FORMAT.applyPattern(mes);
    //		String[] arg = new String[arg0.size()];
    //		for(int i=0; i<arg0.size(); i++){
    //			arg[i] = arg0.get(i).toString();
    //		}
    //		return FORMAT.format(arg);
    //	}
}

package com.logictech.dwzq.core.util.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class JSONUtils {

    /**
     * map转成json
     * 
     * @param map
     * @return
     */
    public static String map2json(Map<?, ?> map) {
        return JSONObject.fromObject(map).toString();
    }

    /**
     * bean 转换成JSON
     * 
     * @param bean 对象参数
     * @return 转换后的JSON字符串
     */
    public static String bean2json(Object bean) {
        return JSONObject.fromObject(bean).toString();
    }

    /**
     * list 转换成JSON
     * 
     * @param list 需要转换的list
     * @return 转换后的JSON字符串
     */
    public static String list2json(List<?> list) {
        return JSONArray.fromObject(list).toString();
    }

    //    /**
    //     * json转成数组
    //     * 
    //     * @param str
    //     * @return
    //     */
    //    public static List<Object> json2Array(String str) {
    //        JSONObject jSONObject = JSONObject.fromObject(str);
    //        List<Object> objectList = new ArrayList<Object>();
    //        for (int i = 0; i < jSONObject.size(); i++) {
    //            if (jSONObject.get(StringUtils.parseInt(i)) != null) {
    //                objectList.add(jSONObject.get(StringUtils.parseInt(i)).toString());
    //            } else {
    //                objectList.add("");
    //            }
    //        }
    //        return objectList;
    //    }
    //    
    //    /**
    //     * 筛选框用JSON escape方法
    //     * @param tagValueJSON
    //     * @return
    //     */
    //    public static String escapeHtml4InputDropdown(String tagValueJSON) {
    //        tagValueJSON = tagValueJSON.replaceAll("'", FWConstants.DEFAULT_SPLIT);
    //        tagValueJSON = tagValueJSON.replaceAll("\"", "\'");
    //        return tagValueJSON;
    //    }

    /**
     * string 转json
     * 
     * @param param
     * @return
     */
    public static JSONObject StringTOJson(String param) {
        if (param != null && param != "") {
            //	    	param = param.substring(1, param.length() -1);
            JSONObject jasonObject = JSONObject.fromObject(param);
            return jasonObject;
        }
        else {
            return null;
        }
    }

    /**
     * 将map中的json字符串转成数组
     * 
     * @param param
     * @return
     */
    public static String[] jsonToArray(String param) {
        if (param != null && param != "") {
            String[] devList = param.toString().substring(1, param.toString().length() - 1).split(",");
            if (devList != null && devList.length > 0) {
                for (int i = 0; i < devList.length; i++) {
                    if (devList[i] != null && devList[i].length() > 2) {
                        devList[i] = devList[i].substring(1, devList[i].length() - 1);
                    }
                }
            }
            return devList;
        }
        else {
            return null;
        }
    }

    /**
     * 将map中的json字符串转成数组
     * 
     * @param param
     * @return
     */
    public static String[] jsonToOArray(String param) {
        if (param != null && param != "") {

            String[] objList = param.toString().substring(1, param.toString().length() - 1).split("},");
            if (objList != null && objList.length > 0) {
                for (int i = 0; i < objList.length; i++) {
                    JSONObject jasonObject2 = null;
                    if (i == objList.length - 1) {
                        jasonObject2 = JSONUtils.StringTOJson(objList[i]);
                    }
                    else {
                        jasonObject2 = JSONUtils.StringTOJson(objList[i] + "}");
                    }
                    objList[i] = jasonObject2.toString();
                }
            }
            return objList;
        }
        else {
            return null;
        }
    }

    /**
     * 从json HASH表达式中获取一个map，改map支持嵌套功能
     * 
     * @param jsonString
     * @return
     */

    public static Map getMap4Json(String jsonString) {
        JSONObject jsonObject = JSONObject.fromObject(jsonString);
        Iterator keyIter = jsonObject.keys();
        String key;
        Object value;
        Map valueMap = new HashMap();

        while (keyIter.hasNext()) {
            key = (String) keyIter.next();
            value = jsonObject.get(key);
            valueMap.put(key, value);
        }

        return valueMap;
    }

    /**
     * 从json对象集合表达式中得到一个java对象列表
     * 
     * @param jsonString
     * @param pojoClass
     * @return
     */
    public static List getList4Json(String jsonString, Class pojoClass) {

        JSONArray jsonArray = JSONArray.fromObject(jsonString);
        JSONObject jsonObject;
        Object pojoValue;

        List list = new ArrayList();
        for (int i = 0; i < jsonArray.size(); i++) {

            jsonObject = jsonArray.getJSONObject(i);
            pojoValue = JSONObject.toBean(jsonObject, pojoClass);
            list.add(pojoValue);

        }
        return list;

    }

    /**
     * 从json HASH表达式中获取一个map，改map支持嵌套功能
     * 
     * @param jsonString
     * @return
     */
    public static List getMapList4Json(String jsonString) {

        JSONArray jsonArray = JSONArray.fromObject(jsonString);
        JSONObject jsonObject;

        List list = new ArrayList();
        for (int i = 0; i < jsonArray.size(); i++) {

            jsonObject = jsonArray.getJSONObject(i);
            Iterator keyIter = jsonObject.keys();
            String key;
            Object value;
            Map valueMap = new HashMap();

            while (keyIter.hasNext()) {
                key = (String) keyIter.next();
                value = jsonObject.get(key);
                valueMap.put(key, value);
            }
            list.add(valueMap);

        }
        return list;
    }

    /**
     * 从一个JSON 对象字符格式中得到一个java对象，其中beansList是一类的集合，形如： {"id" : idValue, "name" : nameValue, "aBean" : {"aBeanId" : aBeanIdValue, ...}, beansList:[{}, {}, ...]}
     * 
     * @param jsonString
     * @param clazz
     * @param map 集合属性的类型 (key : 集合属性名, value : 集合属性类型class) eg: ("beansList" : Bean.class)
     * @return
     */
    public static Object getDTO(String jsonString, Class clazz, Map map) {
        JSONObject jsonObject = null;
        try {
            jsonObject = JSONObject.fromObject(jsonString);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return JSONObject.toBean(jsonObject, clazz, map);
    }
    
    /**
     * 从一个JSON 对象字符格式中得到一个java对象，其中beansList是一类的集合，形如： {"id" : idValue, "name" : nameValue}
     * 
     * @param jsonString
     * @param clazz
     * @return
     */
    public static Object getDTO(String jsonString, Class clazz) {
        JSONObject jsonObject = null;
        try {
            jsonObject = JSONObject.fromObject(jsonString);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return JSONObject.toBean(jsonObject, clazz);
    }
}

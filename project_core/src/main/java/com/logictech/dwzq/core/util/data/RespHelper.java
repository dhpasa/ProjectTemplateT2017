package com.logictech.dwzq.core.util.data;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
 * @ClassName: RespHelper
 * @Description: 同类属性拷贝
 * @author shensuoyao
 */
public class RespHelper {
	
	public static <T> void helper(T source, T target) throws IllegalArgumentException, IllegalAccessException,
			SecurityException, NoSuchMethodException, InvocationTargetException {
		if(target == null) {
			return;
		}
		Class<?> clazz = target.getClass();
		List<Field> fields = new ArrayList<Field>();
		getFields(clazz, fields);
		Map<String, Field> targetFieldMap = new HashMap<String, Field>();
		for (Field f : fields) {
			f.setAccessible(true);
			targetFieldMap.put(f.getName(), f);
		}
		for (Field field : source.getClass().getDeclaredFields()) {
			// 获取属性的名字
			String name = field.getName(); 
			if (!targetFieldMap.containsKey(name)) {
				continue;
			}
			// 将属性的首字符大写，方便构造get，set方法
			String methodName = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
			// 获取属性的类型
			String type = field.getGenericType().toString();
			Method m = null;
			if("int".equals(type)) {
				m = source.getClass().getDeclaredMethod(methodName, int.class);
			} else if("float".equals(type)) {
				m = source.getClass().getDeclaredMethod(methodName, float.class);
			} else if("double".equals(type)) {
				m = source.getClass().getDeclaredMethod(methodName, double.class);
			} else if("boolean".equals(type)) {
				m = source.getClass().getDeclaredMethod(methodName, boolean.class);
			} else if ("class java.lang.String".equals(type)) {
				m = source.getClass().getDeclaredMethod(methodName, String.class);
			} else if("class java.lang.Integer".equals(type)) {
				m = source.getClass().getDeclaredMethod(methodName, Integer.class);
			} else if("class java.lang.Boolean".equals(type)) {
				m = source.getClass().getDeclaredMethod(methodName, Boolean.class);
			} else if("class java.lang.Long".equals(type)) {
				m = source.getClass().getDeclaredMethod(methodName, Long.class);
			} else if("class java.util.Date".equals(type)) {
				m = source.getClass().getDeclaredMethod(methodName, Date.class);
			}
			if(m != null) {
				Object obj = targetFieldMap.get(name).get(target);
				if(obj != null) {
					m.invoke(source, obj);
				}
			}
		}
	}
	
	private static void getFields(Class<?> clazz, List<Field> fieldsList) {
		fieldsList.addAll(Arrays.asList(clazz.getDeclaredFields()));
		Class<?> superClz = clazz.getSuperclass();
		if("java.lang.Object".equals(superClz.getName())) {
			return;
		} else {
			getFields(superClz, fieldsList);
		}
	}
	
}

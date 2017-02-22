package com.logictech.dwzq.core.util.data;

import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtilsBean;

import com.logictech.dwzq.core.util.BaseUtils;

public class BeanUtils extends BaseUtils {
    /**
     * 实体转map
     * @param obj
     * @return
     */
    public static Map<Object, Object> beanToMap(Object obj) {
        Map<Object, Object> params = new HashMap<Object, Object>(0);
        try {
            PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
            PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj);
            for (int i = 0; i < descriptors.length; i++) {
                String name = descriptors[i].getName();
                if (!StringUtils.isEqual(name, "class")) {
                    params.put(name, propertyUtilsBean.getNestedProperty(obj, name));
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return params;
    }
}

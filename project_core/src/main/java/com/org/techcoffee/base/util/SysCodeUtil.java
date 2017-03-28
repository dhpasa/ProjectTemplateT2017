package com.org.techcoffee.base.util;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

public class SysCodeUtil extends BaseUtils{

	/**
	 * 从指定资源获取code的值
	 * @param key
	 * @param list
	 * @return
	 */
	public static String getCodeText(String key, List<MyMap> list) {
        if (key == null || CollectionUtils.isEmpty(list)) {
        	return "";
        }
        Iterator<MyMap> iter = list.iterator();
        while(iter.hasNext()) {
        	if (key.equals(iter.next().getKey())) {
        		return iter.next().getValue();
        	}
        }
        return "";
    }
}

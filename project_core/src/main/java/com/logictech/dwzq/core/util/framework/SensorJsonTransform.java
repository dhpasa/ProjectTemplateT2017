package com.logictech.dwzq.core.util.framework;

import net.sf.json.util.PropertyFilter;

/**
 * 单例
 * list<Sensor>转换json的过滤属性
 * @author Administrator
 *
 */
public class SensorJsonTransform implements PropertyFilter{

	private static PropertyFilter sersonJsonTransform;
	
	private  SensorJsonTransform(){
		
	}
	
	public static PropertyFilter getInstance(){
		if(sersonJsonTransform==null){
			synchronized (SensorJsonTransform.class) {
				if(sersonJsonTransform==null){
					sersonJsonTransform = new SensorJsonTransform();
				}
			}
		}
			return sersonJsonTransform;
	}
	
	
	public boolean apply(Object source, String name, Object value) {
		if(name.equals("id")||name.equals("sensor")||name.equals("typeId")){
			return false;
		}
		return true;
	}
}

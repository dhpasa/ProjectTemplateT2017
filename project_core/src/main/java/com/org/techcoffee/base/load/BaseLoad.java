package com.org.techcoffee.base.load;

/**
 * 优先加载所有需要持久化的数据量
 * 
 * @author Ron.Lin
 *
 */
public class BaseLoad {


	private BaseLoad(){
		
	}

	/**
	 * 静态代码块加载数据
	 */
	static {
		try {

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

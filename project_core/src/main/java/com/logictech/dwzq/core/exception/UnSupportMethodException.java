package com.logictech.dwzq.core.exception;


/**
 * 自定义异常
 * @author hl
 * 不支持该方法时抛出异常
 */
public class UnSupportMethodException extends BaseException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 89458596107684454L;

	public UnSupportMethodException(){
		
	}
	
	public UnSupportMethodException(String msg){
		super(msg);
	}
}

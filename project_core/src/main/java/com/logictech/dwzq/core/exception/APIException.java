package com.logictech.dwzq.core.exception;

import java.lang.Exception;

/** 
 * @ClassName: APIException
 * @Description: API接口自定义的异常类
 * <p>主要是用来区分显示异常，并将异常的堆栈信息输出到日志文件，方便排查问题</p>
 * @author shensuoyao
 */
public class APIException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private Integer errcode;

	public APIException() {
		super();
	}
	
	public APIException(Integer _errcode, String _msg) {
		super("[" + _errcode + "] " + _msg);
		this.errcode = _errcode;
	}

	/** 
	 * @return errcode
	 */
	public Integer getErrcode() {
		return errcode;
	}

	/** 
	 * @param errcode 要设置的 errcode
	 */
	public void setErrcode(Integer errcode) {
		this.errcode = errcode;
	}
	
}

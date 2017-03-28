package com.org.oztt.base.respond;

import java.util.HashMap;
import java.util.Map;

import com.org.techcoffee.base.exception.APIException;

/**
 * @ClassName: JsonResp
 * @Description: Json返回对象
 */
public class TcResponds {

	/**
	 * @Fields success : 请求是否成功
	 *         <p>
	 *         1：成功 0：失败
	 *         </p>
	 */
	private int result;

	private String code = "";

	/**
	 * @Fields error_msg : 请求错误信息
	 *         <p>
	 *         成功时为空,失败时会返回失败信息
	 *         </p>
	 */
	private String msg = "";

	private Integer userId = 0;

	private Map<Object, Object> paramMap;

	private void setRequestAcmp(int result) {
		// if (result == 1 || result == 2) {
		// AcmpInfoDto acmpInfoDto = (AcmpInfoDto)
		// Envir.getRequest().getAttribute(FWConstants.REQ_KEY_ACMPINFODTO);
		// if (acmpInfoDto == null) {
		// acmpInfoDto = new AcmpInfoDto();
		// }
		// this.acmpInfoDto = acmpInfoDto;
		// }
		// else {
		// if (acmpInfoDto == null) {
		// acmpInfoDto = new AcmpInfoDto();
		// }
		// }
	}

	private String setExMsg(Exception ex) {
		String msg = "";
		if (ex instanceof APIException) {
			// msg = MessageUtils.getText("err.com.sys.maintenance");
		} else {
			// msg = MessageUtils.getText("err.com.sys.err");
		}
		return msg;
	}

	public TcResponds() {
		this.paramMap = new HashMap<Object, Object>();
		this.result = 1;
		setRequestAcmp(1);
	}

	public TcResponds(Exception ex) {
		this.paramMap = new HashMap<Object, Object>();
		this.result = 0;
		setRequestAcmp(0);
		this.msg = setExMsg(ex);
	}

	public TcResponds(int _result) {
		this.paramMap = new HashMap<Object, Object>();
		this.result = _result;
		// 返回成功或者部分成功
		setRequestAcmp(_result);
	}

	public TcResponds(int _result, String _msg) {
		this.paramMap = new HashMap<Object, Object>();
		this.result = _result;
		this.msg = _msg;
		setRequestAcmp(_result);
	}

	public TcResponds(int _result, String _msg, Integer _userId) {
		this.paramMap = new HashMap<Object, Object>();
		this.result = _result;
		this.msg = _msg;
		setUserId(_userId);
		setRequestAcmp(_result);
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		// Envir.getRequest().setAttribute(FWConstants.REQ_KEY_USERID, userId);
		this.userId = userId == null ? 0 : userId;
	}

	public Map<Object, Object> getParamMap() {
		return paramMap;
	}

	public void setParamMap(Map<Object, Object> paramMap) {
		// Envir.getRequest().setAttribute(FWConstants.REQ_KEY_MAP, paramMap);
		this.paramMap = paramMap;
	}

}

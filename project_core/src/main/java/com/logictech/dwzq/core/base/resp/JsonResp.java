package com.logictech.dwzq.core.base.resp;

import java.util.HashMap;
import java.util.Map;

import com.logictech.dwzq.core.constants.FWConstants;
import com.logictech.dwzq.core.exception.APIException;
import com.logictech.dwzq.core.util.data.MessageUtils;
import com.logictech.dwzq.core.util.framework.Envir;

/**
 * @ClassName: JsonResp
 * @Description: Json返回对象
 */
public class JsonResp {

    /**
     * @Fields success : 请求是否成功
     *         <p>
     *         1：成功 0：失败
     *         </p>
     */
    private int                 result;

    private String              code   = "";

    /**
     * @Fields error_msg : 请求错误信息
     *         <p>
     *         成功时为空,失败时会返回失败信息
     *         </p>
     */
    private String              msg    = "";

    private Integer             userId = 0;

    private Map<Object, Object> paramMap;

    private String setExMsg(Exception ex) {
        String msg = "";
        if (ex instanceof APIException) {
            msg = MessageUtils.getText("err.com.sys.maintenance");
        } 
        else {
            msg = MessageUtils.getText("err.com.sys.err");
        }
        return msg;
    }

    public JsonResp()
    {
        this.paramMap = new HashMap<Object, Object>();
        this.result = 1;
    }

    public JsonResp(Exception ex)
    {
        this.paramMap = new HashMap<Object, Object>();
        this.result = 0;
        this.msg = setExMsg(ex);
    }

    public JsonResp(int _result)
    {
        this.paramMap = new HashMap<Object, Object>();
        this.result = _result;
    }

    public JsonResp(int _result, String _msg)
    {
        this.paramMap = new HashMap<Object, Object>();
        this.result = _result;
        this.msg = _msg;
    }

    public JsonResp(int _result, String _msg, Integer _userId)
    {
        this.paramMap = new HashMap<Object, Object>();
        this.result = _result;
        this.msg = _msg;
        setUserId(_userId);
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
        Envir.getRequest().setAttribute(FWConstants.REQ_KEY_USERID, userId);
        this.userId = userId == null ? 0 : userId;
    }

    public Map<Object, Object> getParamMap() {
        return paramMap;
    }

    public void setParamMap(Map<Object, Object> paramMap) {
        Envir.getRequest().setAttribute(FWConstants.REQ_KEY_MAP, paramMap);
        this.paramMap = paramMap;
    }
}

package com.logictech.dwzq.core.util.data;

/**
 * 
 * @author wangc
 * 
 * 2014/9/30 下午3:43:26
 */
public class CallResult implements Result{
    protected int    intTimeout       = 0;

    /**
     * 返回代码
     */
    protected int    nRetCode         = Result.OK;

    /**
     * 错误信息
     */
    protected String strErrorInfo     = "";

    /**
     * OK信息
     */
    protected String strOkInfo        = "";

    /**
     * 警告信息
     */
    protected String strWarningInfo   = "";

    /**
     * 提示信息
     */
    protected String strPromptInfo    = "";

    /**
     * 异常信息
     */
    protected String strExceptionInfo = "";

    /**
     * 用户对象
     */
    protected Object userObject       = null;

    public CallResult()
    {
    }

    public int getTimeout() {
        return intTimeout;
    }

    public void setTimeout(int intTimeout) {
        this.intTimeout = intTimeout;
    }

    /**
     * 获取返回值
     * 
     * @return
     */
    public int getRetCode() {
        return nRetCode;
    }

    /**
     * 设置返回值
     * 
     * @param value
     */
    public void setRetCode(int value) {
        nRetCode = value;
    }

    /**
     * 获取错误信息
     * 
     * @return
     */
    public String getErrorInfo() {
        if (nRetCode == Result.OK)
            return "";
        return strErrorInfo;
    }

    /**
     * 设置错误信息
     * 
     * @param value
     */
    public void setErrorInfo(String value) {
        strErrorInfo = value;
        this.setTimeout(5000);
        //        if(!this.IsError() && this.getRetCode() == Result.OK)
        this.setRetCode(Result.NOK);
    }

    /**
     * 判断结果是否为错误
     * 
     * @return
     */
    public boolean IsError() {
        return nRetCode != Result.OK;
    }

    /**
     * 判断结果是否为正确
     * 
     * @return
     */
    public boolean IsOk() {
        return nRetCode == Result.OK;
    }

    /**
     * 填充结果
     * 
     * @param result
     */
    public void Fill(CallResult result) {
        result.setRetCode(nRetCode);
        result.setErrorInfo(strErrorInfo);
        result.setUserObject(userObject);
    }

    /**
     * 从DB结果获取
     * 
     * @param result
     */
    public void From(CallResult result) {
        this.setRetCode(result.getRetCode());
        this.setErrorInfo(result.getErrorInfo());
        this.setUserObject(result.getUserObject());
    }

    /**
     * 获取用户自定义对象
     * 
     * @return
     */
    public Object getUserObject() {
        return this.userObject;
    }

    /**
     * 设置用户自定义对象
     * 
     * @param userObject
     */
    public void setUserObject(Object userObject) {
        this.userObject = userObject;
    }

    /**
     * 重新格式化错误信息
     * 
     * @param strFormat
     */
    public void ReformatErrorInfo(String strFormat) {
        strErrorInfo = String.format(strFormat, strErrorInfo);
    }

    /**
     * 重置返回结果，错误代码设置为 Result.OK
     */
    public void Reset() {
        nRetCode = Result.OK;
        strErrorInfo = "";
        strOkInfo = "";
        strPromptInfo = "";
        strWarningInfo = "";
        userObject = null;
    }

    public static CallResult Create(int nCode) {
        CallResult callResult = new CallResult();
        callResult.setRetCode(nCode);
        return callResult;
    }

    public static CallResult Create(int nCode, String strErrorInfo) {
        CallResult callResult = new CallResult();
        callResult.setRetCode(nCode);
        callResult.setErrorInfo(strErrorInfo);
        return callResult;
    }

    public static CallResult Create(int nCode, String strErrorInfo, Object objUserObject) {
        CallResult callResult = new CallResult();
        callResult.setRetCode(nCode);
        callResult.setErrorInfo(strErrorInfo);
        callResult.setUserObject(objUserObject);
        return callResult;
    }

    public static CallResult ToCallResult(CallResult callResult) {
        if (callResult != null)
            return callResult;

        CallResult cr = new CallResult();
        cr.setRetCode(Result.NOK);
        cr.setErrorInfo("处理异常，返回空结果");
        return cr;
    }

    public String getOkInfo() {
        return strOkInfo;
    }

    public void setOkInfo(String strOkInfo) {
        this.setTimeout(2000);
        this.strOkInfo = strOkInfo;
        this.setRetCode(Result.OK);
    }

    public String getWarningInfo() {
        return strWarningInfo;
    }

    public void setWarningInfo(String strWarningInfo) {
        this.setTimeout(2000);
        this.strWarningInfo = strWarningInfo;
        this.setRetCode(Result.WARNING);
    }

    public String getPromptInfo() {
        return strPromptInfo;
    }

    public void setPromptInfo(String strPromptInfo) {
        this.setTimeout(2000);
        this.strPromptInfo = strPromptInfo;
        this.setRetCode(Result.PROMPT);
    }

    public String getExceptionInfo() {
        return strExceptionInfo;
    }

    public void setExceptionInfo(String strExceptionInfo) {
        this.setTimeout(2000);
        this.strExceptionInfo = strExceptionInfo;
        this.setRetCode(Result.EXCEPTION);
    }
}

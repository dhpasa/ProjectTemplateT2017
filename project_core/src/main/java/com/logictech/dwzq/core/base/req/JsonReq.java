package com.logictech.dwzq.core.base.req;

import com.logictech.dwzq.core.constants.FWConstants;
import com.logictech.dwzq.core.util.data.StringUtils;
import com.logictech.dwzq.core.util.framework.Envir;

public class JsonReq {

    private String userId;

    private String md5Info;
    
    private String token;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        if(StringUtils.isNotEmpty(userId)){
            Envir.getRequest().setAttribute(FWConstants.REQ_KEY_USERID, userId);
        }
        this.userId = userId;
    }

    public String getMd5Info() {
        return md5Info;
    }

    public void setMd5Info(String md5Info) {
        this.md5Info = md5Info;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

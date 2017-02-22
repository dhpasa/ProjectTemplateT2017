package com.logictech.dwzq.core.base.controller;

import org.springframework.ui.ModelMap;

/**
 * @ClassName: BaseController
 * @Description:
 */
public class BaseController {

    protected String                succmsg;

    protected String                errmsg;

    public void optmsg(ModelMap model) {
        model.put("succmsg", succmsg);
        model.put("errmsg", errmsg);
        this.succmsg = null;
        this.errmsg = null;
    }

    /**
     * @return succmsg
     */
    public String getSuccmsg() {
        return succmsg;
    }

    /**
     * @param succmsg 要设置的 succmsg
     */
    public void setSuccmsg(String succmsg) {
        this.succmsg = succmsg;
    }

    /**
     * @return errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
     * @param errmsg 要设置的 errmsg
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

}

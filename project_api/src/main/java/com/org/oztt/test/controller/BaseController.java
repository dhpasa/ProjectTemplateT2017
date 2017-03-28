package com.org.oztt.test.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.ModelMap;

/**
 * @ClassName: BaseController
 * @Description:
 */
public class BaseController {

    protected static final Log      log = LogFactory.getLog("V150");

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

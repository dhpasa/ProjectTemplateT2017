package com.logictech.dwzq.core.constants;

/**
 * @ClassName: Constants
 * @Description: 公共常量
 * @author
 */
public enum SignConstants {
    /**
     * 推荐热度:01
     */
    HOT_LEVEL("01"),

    /**
     * 封闭期:02
     */
    CLOSING_PERIOD("02"),

    /**
     * 产品风险等级:03
     */
    PRODUCT_RISK("03"),

    /**
     * 协议类型:04
     */
    CONTRACT_SET_TYPE("04"),

    /**
     * 有效时长:05
     */
    VALID_DAYS("05");

    private String code;

    SignConstants(String code)
    {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

package com.logictech.dwzq.core.constants;

/**
 * Created by wangchao on 15/10/13.
 */
public enum StatementConstants {
    /**
     * TIPS: code值与导出id相同
     */
    // 新增注册用户数
    LATEST_NEW_MEMBER(1, "新增注册用户数"),
    // 注册用户总数
    LATEST_TOTAL_MEMBER(2, "注册用户总数"),
    // 新增非注册用户数
    LATEST_NEW_VISITOR(3, "新增非注册用户数"),
    // 非注册用户总数
    LATEST_TOTAL_VISITOR(4, "非注册用户总数"),
    // 新增绑定证券用户数
    LATEST_NEW_ZC(5, "新增绑定证券用户数"),
    // 绑定证券账号用户总数
    LATEST_TOTAL_ZC(6, "绑定证券账号用户总数"),
    // 新增绑定理财用户数
    LATEST_NEW_LC(7, "新增绑定理财用户数"),
    // 绑定理财用户总数
    LATEST_TOTAL_LC(8, "绑定理财用户总数"),
    // 新增注册与非注册用户总和
    LATEST_NEW_TOTAL(9, "新增注册与非注册用户总和"),
    // 注册与非注册用户总和
    LATEST_TOTAL(10, "注册与非注册用户总和"),

    // 注册用户占比
    MEMBER_PERCENT(1, "注册用户占比"),
    // 绑定证券用户占比
    ZC_PERCENT(2, "绑定证券用户占比"),
    // 绑定理财用户占比
    LC_PERCENT(3, "绑定理财用户占比");

    private int code;
    private String name;

    private StatementConstants(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return name;
    }
}

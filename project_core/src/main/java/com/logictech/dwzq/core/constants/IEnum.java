package com.logictech.dwzq.core.constants;
/**
 * @author ma.jinchang
 */
public interface IEnum {

    /**
     * 返回枚举区分
     * 
     * @return 枚举类型名
     */
    public String getEnumName();

    /**
     * 取得编号
     * 
     * @return 枚举code
     */
    public String getCode();

    /**
     * 取得label
     * 
     * @return 枚举名
     */
    public String getLabel();
}

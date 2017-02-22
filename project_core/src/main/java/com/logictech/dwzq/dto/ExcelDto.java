package com.logictech.dwzq.dto;

/**
 * @author Canon
 */
public class ExcelDto {

    /**
     * 显示值
     */
    private String value;

    /**
     * 列宽
     */
    private Short width;

    /**
     * 粗体
     */
    private Short boldweight;

    /**
     * 背景色
     */
    private Short backGroundColor;

    /**
     * 字体
     */
    private String fontName;

    /**
     * 字体大小
     */
    private Short fontSize;

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the width
     */
    public Short getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(Short width) {
        this.width = width;
    }

    /**
     * @return the boldweight
     */
    public Short getBoldweight() {
        return boldweight;
    }

    /**
     * @param boldweight the boldweight to set
     */
    public void setBoldweight(Short boldweight) {
        this.boldweight = boldweight;
    }

    /**
     * @return the backGroundColor
     */
    public Short getBackGroundColor() {
        return backGroundColor;
    }

    /**
     * @param backGroundColor the backGroundColor to set
     */
    public void setBackGroundColor(Short backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    /**
     * @return the fontName
     */
    public String getFontName() {
        return fontName;
    }

    /**
     * @param fontName the fontName to set
     */
    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    /**
     * @return the fontSize
     */
    public Short getFontSize() {
        return fontSize;
    }

    /**
     * @param fontSize the fontSize to set
     */
    public void setFontSize(Short fontSize) {
        this.fontSize = fontSize;
    }

}

package com.logictech.dwzq.dto;

/**
 * @author Canon
 */
public class DropDownDto implements Comparable<DropDownDto> {

    /**
     * 下拉框的键
     */
    private String id;

    /**
     * 下拉框显示值
     */
    private String name;

    /**
     * 显示顺序
     */
    private Integer sort;
    
    /**
     * 显示标志
     */
    private boolean bool;
    
    /**
     * 拼音缩写
     */
    private String pinyin;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort the sort to set
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
    
    /**
	 * @return the pinyin
	 */
	public String getPinyin() {
		return pinyin;
	}

	/**
	 * @param pingyin the pinyin to set
	 */
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	/*
     * (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(DropDownDto o) {
        if (o == null || o.getSort() == null) {
            return 1;
        }
        if (null == getSort()) {
            return -1;
        }
        return getSort().compareTo(o.getSort());
    }

	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

}

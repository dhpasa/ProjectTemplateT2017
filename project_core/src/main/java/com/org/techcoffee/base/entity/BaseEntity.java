package com.org.techcoffee.base.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: BaseEntity
 * @Description: 公共实体对象
 */
public class BaseEntity implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private Date addtimestamp;

    private String adduserkey;

    private Date updtimestamp;

    private String upduserkey;

    private String updpgmid;
    
    private String deleteflg;

	public Date getAddtimestamp() {
		return addtimestamp;
	}

	public void setAddtimestamp(Date addtimestamp) {
		this.addtimestamp = addtimestamp;
	}

	public String getAdduserkey() {
		return adduserkey;
	}

	public void setAdduserkey(String adduserkey) {
		this.adduserkey = adduserkey;
	}

	public Date getUpdtimestamp() {
		return updtimestamp;
	}

	public void setUpdtimestamp(Date updtimestamp) {
		this.updtimestamp = updtimestamp;
	}

	public String getUpduserkey() {
		return upduserkey;
	}

	public void setUpduserkey(String upduserkey) {
		this.upduserkey = upduserkey;
	}

	public String getUpdpgmid() {
		return updpgmid;
	}

	public void setUpdpgmid(String updpgmid) {
		this.updpgmid = updpgmid;
	}

	public String getDeleteflg() {
		return deleteflg;
	}

	public void setDeleteflg(String deleteflg) {
		this.deleteflg = deleteflg;
	}
}

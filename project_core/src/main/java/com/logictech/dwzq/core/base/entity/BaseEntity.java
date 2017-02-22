package com.logictech.dwzq.core.base.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: BaseEntity
 * @Description: 公共实体对象
 */
public class BaseEntity implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private Date              createTime;

    private Integer           createUser;

    private Date              updateTime;

    private Integer           updateUser;
    
    private Integer           versionNo;

    public BaseEntity()
    {
        this.updateTime = new Date();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }
    

}

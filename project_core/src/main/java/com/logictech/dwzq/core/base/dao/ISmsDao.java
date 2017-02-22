package com.logictech.dwzq.core.base.dao;

import java.util.Map;

public interface ISmsDao {
    
    public String sendSms(Map<String, Object> map);
    
}
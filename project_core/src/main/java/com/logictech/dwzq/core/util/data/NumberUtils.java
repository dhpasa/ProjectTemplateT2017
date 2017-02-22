package com.logictech.dwzq.core.util.data;

import java.math.BigDecimal;

import com.logictech.dwzq.core.constants.FWConstants;
import com.logictech.dwzq.core.util.BaseUtils;

public class NumberUtils extends BaseUtils {
    /**
     * 将字符串转换为数字
     * 
     * @param str 字符串
     * @param min 是否设置成最大值。 如果为false， 当转换异常时返回int的最大值
     * @return 转换后的数字
     */
    public static int stringToInt(String str, boolean min) {
        int result = 0;
        try {
            result = Integer.parseInt(str);
        } catch (Exception e) {
            if (!min) {
                result = Integer.MAX_VALUE;
            }
        }
        return result;
    }
    
    /**
     * 将字符串转换为int
     * 
     * @param str
     * @param min
     * @return
     */
    public static int stringToInt(String str, int defult) {
    	int result = 0;
        try {
            result = Integer.parseInt(str);
        } catch (Exception e) {
           	result = defult;
        }
        return result;
    }

    /**
     * Integer 转换成Short
     * 
     * @param intValue
     * @return
     */
    public static Short intToShort(Integer intValue) {
        //TODO bug fix
        if (null == intValue) {
            return null;
        }
        return Short.valueOf(String.valueOf(intValue));
    }

    /**
     * 将字符串转换为long
     * 
     * @param str
     * @param min
     * @return
     */
    public static long stringToLong(String str, boolean min) {
        long result = 0;
        try {
            result = Long.parseLong(str);
        } catch (Exception e) {
            if (!min) {
                result = Long.MAX_VALUE;
            }
        }
        return result;
    }
    
    /**
     * 将字符串转换为long
     * 
     * @param str
     * @param min
     * @return
     */
    public static long stringToLong(String str, long defult) {
    	long result = 0;
        try {
            result = Long.parseLong(str);
        } catch (Exception e) {
           	result = defult;
        }
        return result;
    }

    /**
     * Integer 转换成long
     * 
     * @param intValue
     * @return
     */
    public static long intTolong(Integer intValue) {
        //TODO bug fix
        if (null == intValue) {
            return 0;
        }
        return Long.valueOf(String.valueOf(intValue));
    }

    /**
     * 将字符串转换为Short
     * 
     * @param str
     * @param min
     * @return
     */
    public static Short stringToShort(String str, boolean min) {
        Short result = 0;
        try {
            result = Short.parseShort(str);
        } catch (Exception e) {
            if (!min) {
                result = Short.MAX_VALUE;
            }
        }
        return result;
    }
    
    /**
     * 将字符串转换为Short
     * 
     * @param str
     * @param min
     * @return
     */
    public static Short stringToShort(String str, Short defult) {
        Short result = 0;
        try {
            result = Short.parseShort(str);
        } catch (Exception e) {
           	result = defult;
        }
        return result;
    }
    
    /**
     * 将字符串转换为Bety
     * 
     * @param str
     * @param min
     * @return
     */
    public static Byte stringToByte(String str, boolean min) {
    	Byte result = 0;
        try {
            result = Byte.parseByte(str);
        } catch (Exception e) {
            if (!min) {
                result = Byte.MAX_VALUE;
            }
        }
        return result;
    }

    /**
     * Short 比较大小
     * 
     * @param s1 参数
     * @param s2 参数
     * @return 比较结果
     */
    public static int compareShort(Short s1, Short s2) {
        if (s1 == null) {
            s1 = 0;
        }
        if (s2 == null) {
            s2 = 0;
        }
        return s1.compareTo(s2);
    }

    /**
     * bigdecimal 转成百分比
     * 
     * @param b 传入参数
     * @return 转换后的班费比
     */
    public static String bigDecimalToPersent(BigDecimal b) {
        if (b == null) {
            return null;
        }
        String persentVal = b.multiply(new BigDecimal(FWConstants.PERSENT_MULTIPLY)).toString();
        String realValue = "";
        if (persentVal.contains(FWConstants.BIGDECIMAL_POINT)) {
            realValue = persentVal.split(FWConstants.BIGDECIMAL_POINT_SPLIT)[0];
        }
        return realValue + FWConstants.PERSENT;
    }
    
    /**
     * Long转String
     * @param longVal
     * @return
     */
    public static String longToString(Long longVal){
        if(longVal == null){
            return null;
        }else{
            return Long.toString(longVal);
        }
    }
    
    /**
     * string 转BigDecimal
     * @param str
     * @return
     */
    public static BigDecimal stringToBigDecimal(String str){
        BigDecimal result = new BigDecimal(0);
        try {
            result = new BigDecimal(str);
        } catch (Exception e) {
            
        }
        return result;
    }
}

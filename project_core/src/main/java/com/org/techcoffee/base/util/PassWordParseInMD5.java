package com.org.techcoffee.base.util;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 普通MD5加密算法
 * @author Ron.Lin
 *
 */
public class PassWordParseInMD5 {
    public static String Md5(String plainText) { 
        StringBuffer buf = new StringBuffer(""); 
        try { 
            MessageDigest md = MessageDigest.getInstance("MD5"); 
            md.update(plainText.getBytes()); 
            byte b[] = md.digest(); 
            int i; 
            for (int offset = 0; offset < b.length; offset++) { 
                i = b[offset]; 
                if(i<0) i+= 256; 
                if(i<16) 
                buf.append("0"); 
                buf.append(Integer.toHexString(i)); 
            }
        } catch (NoSuchAlgorithmException e) { 
            e.printStackTrace(); 
        }
        return buf.toString();
    } 
    
    @SuppressWarnings("static-access")
	public static void main(String[] args) {
    	File file = new File("D:\\logs");
    	file.mkdir();
    }
}

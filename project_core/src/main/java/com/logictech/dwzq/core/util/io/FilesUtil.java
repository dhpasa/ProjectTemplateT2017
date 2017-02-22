/**   
* Title: FilesUtil.java
* Package com.linggou.net.common.utils
* All rights Reserved, Designed By soyo
* Copyright: Copyright(C) 2010-2015
* Company: soyo SuZhou LTD.
* Create By shensuoyao
* Create Date 2014年8月21日 上午9:53:23
* Version V1.0
*/ 
package com.logictech.dwzq.core.util.io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

/** 
 * @ClassName: FilesUtil
 * @Description: 文件工具
 */
public class FilesUtil {

	/** 
	* @Title: flushFileStore
	* @Description: 存储图片到磁盘
	* @param mpFiles
	* @param targetPath
	* @return String[]
	* @throws 
	*/ 
	public static String[] flushFileStore(MultipartFile[] mpFiles, String absPath, String imgpath) {
		if(mpFiles == null) {
			return new String[]{};
		}
		File foldler = new File(absPath + imgpath);
		if(!foldler.exists()) {
			foldler.mkdirs();
		}
		String[] filesPath = new String[mpFiles.length];
		int idx = 0;
		for(MultipartFile mf : mpFiles) {
			if(!mf.isEmpty()) {
				String f_name = mf.getOriginalFilename();
				f_name = new RandomGUID().valueAfterMD5 + f_name.substring(f_name.lastIndexOf("."));
				try {
					FileUtils.copyInputStreamToFile(mf.getInputStream(), new File(absPath + imgpath, f_name));
					filesPath[idx++] = imgpath + f_name;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return filesPath;
	}
    /**
     * @Title: flushFileStore
     * @Description: 存储图片到磁盘
     * @author shensuoyao
     * @param mpFiles
     * @param targetPath
     * @return String[]
     * @throws
     */
    public static String flushFileStore(MultipartFile mpFiles, String absPath, String imgpath,String fileName) {
        if (mpFiles == null) {
            return null;
        }
        File foldler = new File(absPath);
        if (!foldler.exists()) {
            foldler.mkdirs();
        }
        String filesPath = "";
        if (!mpFiles.isEmpty()) {
                try {
                    FileUtils.copyInputStreamToFile(mpFiles.getInputStream(), new File(absPath, fileName));
                    filesPath = absPath+"/"+imgpath;
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return filesPath;
    }
	/** 
	* @Title: generatePathForUid
	* @Description: 生成图片路径
	* @author shensuoyao
	* @param uid
	* @return String
	* @throws 
	*/ 
	public static String generatePathForUid(String uid) {
    	int len = uid.length();
    	int seg = len / 2;
    	int mod = len % 2;
    	StringBuffer path = new StringBuffer(64);
    	for(int i = 0; i < seg; i ++) {
    		int start = i * 2;
    		path.append(uid.substring(start,start + 2)).append("/");
    	}
    	if(mod == 1) {
    		path.append(0 + uid.substring(uid.length() - 1)).append("/");
    	}
    	return path.toString();
    }
	
	public static void main(String[] args) {
		String path = generatePathForUid("1326555");
		System.out.println(path);
	}
	
}

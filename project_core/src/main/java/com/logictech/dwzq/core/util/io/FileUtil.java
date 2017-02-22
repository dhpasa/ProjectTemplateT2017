package com.logictech.dwzq.core.util.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import com.logictech.dwzq.core.constants.FWConstants;
import com.logictech.dwzq.core.exception.type.FileMoveException;
import com.logictech.dwzq.core.exception.type.SystemException;
import com.logictech.dwzq.core.util.BaseUtils;
import com.logictech.dwzq.core.util.data.DateUtils;
import com.logictech.dwzq.core.util.data.MessageUtils;
import com.logictech.dwzq.core.util.data.StringUtils;
import com.logictech.dwzq.core.util.framework.Envir;

@SuppressWarnings("resource")
public class FileUtil extends BaseUtils {

    /**
     * 文件复制
     * 
     * @param sourceFile
     * @param destFilePath
     */
    public static Boolean copyFile(File sourceFile, String destFilePath) {
    	Boolean result = true;
        FileInputStream in = null;
        FileOutputStream out = null;
        byte[] buffer = new byte[10240000];
        try {
            in = new FileInputStream(sourceFile);
            File dest = new File(destFilePath);
            if (!dest.exists()) {
                //目标文件对应的目录不存在，创建新的目录 
                int index = new String(destFilePath).lastIndexOf(File.separator);
                String path = destFilePath.substring(0, index);
                new File(path).mkdirs();
            }
            out = new FileOutputStream(destFilePath);
            int num = 0;
            while ((num = in.read(buffer)) != -1) {
                out.write(buffer, 0, num);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            result = false;
        } catch (IOException e) {
            e.printStackTrace();
            result = false;
        } finally {
            try {
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                result = false;
            }
        }
        return result;
    }

    /**
     * 文件上传
     * 
     * @param file 文件
     * @param fileName 文件名
     * @return 上传结果
     */
    public static Map<String, Object> uploadFile(File file, String fileName) {
        //判断传入参数
        if (StringUtils.isEmpty(fileName)) {
            return new HashMap<String, Object>();
        }
        ResourceBundle sysSetting = ResourceBundle.getBundle("system");
        String PATH = sysSetting.getString("IMAGE_ADVERTISES");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(FWConstants.FILE_UPLOAD_RESULT_RETURN_FLAG, false);
        try {
            if (file != null) {
                fileName = longFileRename(fileName);
                fileName = DateUtils.dateToString(DateUtils.PATTEN_FILE_RENAME) + "_" + fileName;
                //取到文件流
                InputStream is;
                is = new FileInputStream(file);
                String filePath;
                String returnFilePath;
                String fileFolder;
                //判断文件类型
                String fileRelativeFolder = DateUtils.dateToString(DateUtils.PATTEN_YM);
                fileFolder = PATH +"/"+ fileRelativeFolder;
                filePath = fileFolder + File.separator + fileName;
                //returnFilePath = fileRelativeFolder + File.separator + fileName;
                //暂时使用一个临时目录
                returnFilePath = fileName;
                		
                //如果文件夹不存在， 创建
                File fileFolderFile = new File(fileFolder);
                if (!fileFolderFile.exists()) {
                    fileFolderFile.mkdirs();
                }
                //创建文件输出流
                OutputStream os = new FileOutputStream(filePath);
                //缓存字节
                byte buffer[] = new byte[1024];
                //缓存字节大小
                int count = 0;
                //写文件
                while ((count = is.read(buffer)) > 0) {
                    os.write(buffer, 0, count);
                }
                //关闭流
                os.close();
                is.close();
                map.put(FWConstants.FILE_UPLOAD_RESULT_RETURN_FLAG, true);
                map.put(FWConstants.FILE_UPLOAD_RESULT_FILE_RELATIVE_PATH, returnFilePath);
                map.put(FWConstants.FILE_UPLOAD_RESULT_FILE_REAL_PATH, filePath);
                map.put(FWConstants.FILE_UPLOAD_RESULT_FILE_RENAME, fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }
    
    /**
     * 临时文件上传
     * 
     * @param file 文件
     * @param fileName 文件名
     * @return 上传结果
     */
    public static Map<String, Object> uploadTempFile(File file, String fileName) {
        //判断传入参数
        if (StringUtils.isEmpty(fileName)) {
            return new HashMap<String, Object>();
        }
        ResourceBundle sysSetting = ResourceBundle.getBundle("system");
        String PATH = sysSetting.getString("IMAGE_ADVERTISES");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(FWConstants.FILE_UPLOAD_RESULT_RETURN_FLAG, false);
        try {
            if (file != null) {
                fileName = longFileRename(fileName);
                fileName = DateUtils.dateToString(DateUtils.PATTEN_FILE_RENAME) + "_" + fileName;
                //取到文件流
                InputStream is;
                is = new FileInputStream(file);
                String filePath;
                String returnFilePath;
                String fileFolder;
                //判断文件类型
                String fileRelativeFolder = DateUtils.dateToString(DateUtils.PATTEN_YMD_NO_SEPRATE);
                fileFolder = PATH + fileRelativeFolder;
                filePath = fileFolder + File.separator + fileName;
                //returnFilePath = fileRelativeFolder + File.separator + fileName;
                //暂时使用一个临时目录
                returnFilePath = fileName;
                		
                //如果文件夹不存在， 创建
                File fileFolderFile = new File(fileFolder);
                if (!fileFolderFile.exists()) {
                    fileFolderFile.mkdirs();
                }
                //创建文件输出流
                OutputStream os = new FileOutputStream(filePath);
                //缓存字节
                byte buffer[] = new byte[1024];
                //缓存字节大小
                int count = 0;
                //写文件
                while ((count = is.read(buffer)) > 0) {
                    os.write(buffer, 0, count);
                }
                //关闭流
                os.close();
                is.close();
                map.put(FWConstants.FILE_UPLOAD_RESULT_RETURN_FLAG, true);
                map.put(FWConstants.FILE_UPLOAD_RESULT_FILE_RELATIVE_PATH, returnFilePath);
                map.put(FWConstants.FILE_UPLOAD_RESULT_FILE_REAL_PATH, filePath);
                map.put(FWConstants.FILE_UPLOAD_RESULT_FILE_RENAME, fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }

    /**
     * 创建文件夹
     * 
     * @param folder
     * @return
     * @throws IOException
     */
    public static String createFolder(String folder) throws IOException {
        File f = new File(Envir.getHome() + File.separator + folder);
        if (!f.exists()) {
            f.mkdirs();
        }
        return folder;
    }

    /**
     * 获取文件的后缀
     * 
     * @param path
     * @return String
     */
    public static String getFileNameExtension(String path) {
        String extension = "";
        if (StringUtils.isNotEmpty(path)) {
            int index = path.lastIndexOf(".");
            if (index > -1 && index < path.length()) {
                extension = path.substring(index + 1);
            }
        }
        return extension;
    }

    /**
     * 获取文件的名称不含后缀
     * 
     * @param fileFullName 文件全名非路径
     * @return String
     */
    public static String getFileName(String fileFullName) {
        String extension = "";
        if (StringUtils.isNotEmpty(fileFullName)) {
            int index = fileFullName.lastIndexOf(".");
            if (index > -1 && index < fileFullName.length()) {
                extension = fileFullName.substring(0, index);
            }
        }
        return extension;
    }

    /**
     * 判断文件大小是否大于1M
     * 
     * @param file
     * @return boolean
     */
    public static boolean checkFileExcelSize(File file) {
        return checkFileSize(file, FWConstants.FILE_EXCEL_CHECKSIZE);
    }

    /**
     * 判断文件大小是否大于200K
     * 
     * @param file
     * @return boolean
     */
    public static boolean checkFileImgSize(File file) {
        return checkFileSize(file, FWConstants.FILE_IMG_CHECKSIZE);
    }

    /**
     * 判断文件大小
     * 
     * @param file
     * @param size
     * @return boolean
     */

	private static boolean checkFileSize(File file, Double size) {
        boolean flag = false;
        if (file.exists()) {
            try {
                FileInputStream fs = new FileInputStream(file);
                try {
                    if (fs.available() < size * 1024) {
                        flag = true;
                    }
                } catch (IOException e) {
                    throw new SystemException(e.getMessage());
                }
            } catch (FileNotFoundException e) {
                throw new SystemException(e.getMessage());
            }

        }

        return flag;
    }

    /**
     * 获取文件的大小
     * 
     * @param file
     * @return
     */
    public static long getFileSize(File file) {
        if (file.exists()) {
            try {
                FileInputStream fs = new FileInputStream(file);
                try {
                    return (long) fs.available();
                } catch (IOException e) {
                    throw new SystemException(e.getMessage());
                }
            } catch (FileNotFoundException e) {
                throw new SystemException(e.getMessage());
            }

        }
        return (long) 0;
    }

    /**
     * 删除文件，文件不存在则返回false
     * 
     * @param sPath
     * @return
     */
    public static boolean deleteFile(String sPath) {
        boolean flag = false;
        File file = new File(sPath);
        // 路径为文件且不为空则进行删除  
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        return flag;
    }

    /**
     * 文件路径解密
     * 
     * @param relativePath
     * @return
     */
    public static String getFileAbsolutePath(String relativePath) {
        if (StringUtils.isEmpty(relativePath)) {
            return "";
        }
        ResourceBundle sysSetting = ResourceBundle.getBundle("system");
        String PATH = sysSetting.getString("FILE_UPLOAD_PATH");
        return PATH + relativePath;
    }

    /**
     * 取得文件全名（不包含路径）
     * 
     * @param filePath
     * @return
     */
    public static String getFullFileName(String filePath) {
        if (StringUtils.isEmpty(filePath)) {
            return filePath;
        }
        if (!StringUtils.isContains(filePath, File.separator)) {
            return filePath;
        }
        String fileName = filePath.substring(filePath.lastIndexOf(File.separator) + 1);
        return fileName;
    }

    /**
     * 取得excel模版文件路径
     * 
     * @param relativePath
     * @return
     */
    public static String getTemplateFilePath() {
        ResourceBundle sysSetting = ResourceBundle.getBundle("system");
        String PATH = sysSetting.getString("BASE_PATH") + sysSetting.getString("EXCEL_TEMPLATE_PATH");
        return PATH;
    }

    /**
     * 文件名长度大于20时截取前20个字符作为文件名
     * @param fileName
     * @return
     */
    public static String longFileRename(String fileName) {
        if(!fileName.contains(".")) {
            return fileName;
        }
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        String fileNameTmp = fileName.substring(0, fileName.lastIndexOf("."));
        
        if(fileNameTmp.length()>FWConstants.FILE_UPLOAD_NAME_LENGTH_LIMIT) {
            fileNameTmp = fileNameTmp.substring(0, FWConstants.FILE_UPLOAD_NAME_LENGTH_LIMIT);
        }
        return fileNameTmp + fileSuffix;
    }   
    
    /**
     * 移动文件
     * @param fileRelativePath文件关联路径
     * @param type类别
     * @param code主键编号
     * @return
     */
    public static String moveFile(String fileRelativePath, String type, String code){
    	//判断文件类别的有效性
    	if(!type.equals(FWConstants.FILE_TYPE_VENUE) &&  !type.equals(FWConstants.FILE_TYPE_PAVILION)
    			&&!type.equals(FWConstants.FILE_TYPE_AREA) &&  !type.equals(FWConstants.FILE_TYPE_VENUEMANAGE)
    			&&!type.equals(FWConstants.FILE_TYPE_PERFORMGROUP) &&  !type.equals(FWConstants.FILE_TYPE_PARAMETER)
    			&&!type.equals(FWConstants.FILE_TYPE_AD) &&  !type.equals(FWConstants.FILE_TYPE_TOPIC)
    			&&  !type.equals(FWConstants.FILE_TYPE_PROJECT)){
    		throw new FileMoveException(MessageUtils.getText("ERR.COMMON.058"));
    	}
    	//获取原文件
    	ResourceBundle sysSetting = ResourceBundle.getBundle("system");
    	String tempPath = sysSetting.getString("IMAGE_ADVERTISES") + fileRelativePath;
    	File file = new File(tempPath);
    	//文件名
    	String fileName = getFullFileName(fileRelativePath);
    	//目标路径
    	String destFilePath = sysSetting.getString("FILE_UPLOAD_PATH") + type + File.separator  + code + File.separator;
    	//返回路径
    	String returnPath = type + File.separator  + code + File.separator + fileName;
    	//移动
    	if(copyFile(file, destFilePath)){
    		return returnPath;
    	}else{
    		throw new FileMoveException(MessageUtils.getText("ERR.COMMON.058"));
    	}
    }
    
    /**
     * 返回移动后的文件目录
     * @param fileName 文件名
     * @param type 类型
     * @param code 主键代码
     * @return
     */
    public static String getNewFilePath(String fileName, String type, String code){
    	String returnPath = type + File.separator  + code + File.separator + fileName;
    	return returnPath;
    }
    
   }

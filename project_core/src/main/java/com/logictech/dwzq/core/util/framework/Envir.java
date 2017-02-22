package com.logictech.dwzq.core.util.framework;

import java.util.ResourceBundle;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.logictech.dwzq.core.util.BaseUtils;
import com.logictech.dwzq.core.util.data.StringUtils;

public class Envir extends BaseUtils {

    /**
     * 上下文路径
     */
    private static String contextPath = getRequest().getContextPath();

    /**
     * 请求路径
     */
    private static String realPath = "";

    //private static ResourceBundle sysSetting = ResourceBundle.getBundle("system");

    /**
     * 获取上下文路径
     * 
     * @return
     */
    public static String getContextPath() {
        return contextPath;
    }

    /**
     * 获取根路径
     * 
     * @return
     */
    public static String getHome() {
        return realPath;
    }

    //    public static String getBaseFilePath() {
    //        return sysSetting.getString("baseFilePath");
    //    }

    /**
     * 获取request对象
     * 
     * @return
     */
    public static HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    /**
     * 获取response对象
     * 
     * @return
     */
//    public static HttpServletResponse getResponse() {
//        return ServletActionContext.getResponse();
//    }

    /**
     * 获取Session对象
     * 
     * @return
     */
    public static HttpSession getSession() {
        return getRequest().getSession();
    }

    /**
     * 设置Session值
     * 
     * @param id
     * @param value
     */
    public static void setSessionAttribute(String id, Object value) {
        getRequest().getSession().setAttribute(id, value);
    }

    /**
     * 清空Session值，如果传入Null， 清空所有非登录信息
     * 
     * @TODO
     * @param id
     */
    public static void removeSessionAttribute(String id) {
        if (StringUtils.isEmpty(id)) {
            //@TODO删除非登录信息
            getRequest().getSession().getAttributeNames();
            return;
        }
        getRequest().getSession().removeAttribute(id);
    }

    /**
     * 取得Session的值
     * 
     * @param id
     * @return
     */
    public static Object getSessionAttribute(String id) {
        return getRequest().getSession().getAttribute(id);
    }

    /**
     * 获取request 请求URL
     * 
     * @return
     */
    public static String getUrl() {
        String queryString = getRequest().getQueryString();
        if (StringUtils.isEmpty(queryString)) {
            return getRequest().getRequestURL().toString();
        }
        return getRequest().getRequestURL().append("?").append(queryString).toString();
    }

    /**
     * 
     */
    public static String getRequestURI() {
        return getRequest().getRequestURI();
    }

    /**
     * 取得BASEURL地址，例如：http://localhost:8080/CRS之类
     * 
     * @return
     */
    public static String getBaseUrl() {
        ResourceBundle sysSetting = ResourceBundle.getBundle("system");
        return sysSetting.getString("baseUrl");
        //		return "http://"+ServletActionContext.getRequest().getServerName()+":"+
        //			ServletActionContext.getRequest().getServerPort()+
        //			ServletActionContext.getRequest().getContextPath();
    }
    
    /**
     * 取得后台上传的img的路径
     * 
     * @return
     */
    public static String getImgUrl() {
        ResourceBundle sysSetting = ResourceBundle.getBundle("system");
        return sysSetting.getString("IMG_URL");
    }

    /**
     * 获取导出临时文件的路径
     * 
     * @return
     */
    public static String getBaseExportPath() {
        ResourceBundle sysSetting = ResourceBundle.getBundle("system");
        return sysSetting.getString("FILE_EXPORT_PATH");
    }

    /**
     * 获取Excel模板文件路径
     * 
     * @return
     */
    public static String getExcelTemplatePath() {
        String path = "";
        ResourceBundle sysSetting = ResourceBundle.getBundle("system");
        path = sysSetting.getString("BASE_PATH") + sysSetting.getString("EXCEL_TEMPLATE_PATH");
        return path;
    }
    
    /**
     * 获取手机电子票模板
     * 
     * @return
     */
    public static String getMobileTemplate() {
        String mobileTemplate = "";
        ResourceBundle sysSetting = ResourceBundle.getBundle("etickettemplate");
        mobileTemplate = sysSetting.getString("MOBILE");
        return mobileTemplate;
    }
    
    /**
     * 获取邮箱电子票模板
     * 
     * @return
     */
    public static String getEmailTemplate() {
        String emailTemplate = "";
        ResourceBundle sysSetting = ResourceBundle.getBundle("etickettemplate");
        emailTemplate = sysSetting.getString("EMAIL");
        return emailTemplate;
    }
    
    /**
     * 取得springBean
     * 
     * @param beanName
     * @return
     */
    public static Object getSpringBean(String beanName) {
        ServletContext servletContext = getRequest().getSession().getServletContext();
        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        return wac.getBean(beanName);
    }
    
    /**
     * 获取ADServerUrl
     * 
     * @return
     */
    public static String getADServerUrl() {
        ResourceBundle sysSetting = ResourceBundle.getBundle("system");
        String host = sysSetting.getString("ACTIVEDIRECTORY_SYN_HOST"); // AD服务器IP
    	String port = sysSetting.getString("ACTIVEDIRECTORY_SYN_PORT");; // 端口 
    	return new String("ldap://" + host + ":" + port);
    }
    
    /**
     * 获取adminName
     * 
     * @return
     */
    public static String getAdminName() {
        ResourceBundle sysSetting = ResourceBundle.getBundle("system");
        String adminName = sysSetting.getString("ACTIVEDIRECTORY_SYN_ADMINNAME"); // AD服务器IP
    	return adminName;
    }
    
    /**
     * 获取adminPassword
     * 
     * @return
     */
    public static String getAdminPassword() {
        ResourceBundle sysSetting = ResourceBundle.getBundle("system");
        String adminPassword = sysSetting.getString("ACTIVEDIRECTORY_SYN_ADMINPASSWORD"); // AD服务器IP
    	return adminPassword;
    }
    
    /**
     * 获取searchBase
     * 
     * @return
     */
    public static String getSearchBase() {
        ResourceBundle sysSetting = ResourceBundle.getBundle("system");
        String searchBase = sysSetting.getString("ACTIVEDIRECTORY_SYN_searchBase"); // AD服务器IP
    	return searchBase;
    }


}

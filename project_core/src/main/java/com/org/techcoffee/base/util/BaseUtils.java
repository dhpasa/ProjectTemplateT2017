package com.org.techcoffee.base.util;

import java.io.FileInputStream;
import java.util.Locale;
import java.util.Properties;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 * 一些工程的工具类
 * 
 * @author Ron.Lin
 *
 */
public class BaseUtils {
	
	/**
	 * log统一实例化
	 */
	protected final static Logger logger = LoggerFactory.getLogger(BaseUtils.class);
	
	public static Logger getLogger(){
		return logger;
	}

	public static String getApplicationMessage(String key, HttpSession session) throws Exception {

		FileInputStream messageStream = null;
		try {
			String language = "";
			if (session == null) {
				language = Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
			} else {
				Locale locale = (Locale) session.getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
				if (locale == null) {
					language = Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
				} else {
					language = locale.getLanguage() + "_" + locale.getCountry();
				}
			}
			String s = BaseUtils.class.getClassLoader().getResource("/").getPath().toString();
			s = java.net.URLDecoder.decode(s, "UTF-8");
			Properties properties = new Properties();
			if ("zh_CN".equals(language)) {
				messageStream = new FileInputStream(s + "/application_zh_CN.properties");
			} else if ("en_US".equals(language)) {
				messageStream = new FileInputStream(s + "/application_en_US.properties");
			} else {
				messageStream = new FileInputStream(s + "/application_zh_CN.properties");
			}
			properties.load(messageStream);
			if (properties.containsKey(key)) {
				String value = new String(properties.getProperty(key));
				return value;
			} else {
				return key;
			}
		} catch (Exception e) {
			return key;
		} finally {
			if (messageStream != null) {
				messageStream.close();
				messageStream = null;
			}
		}
	}

	public static String getMessage(String key, HttpSession session) throws Exception {

		FileInputStream messageStream = null;
		try {

			String language = "";
			if (session == null) {
				language = Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
			} else {
				Locale locale = (Locale) session.getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
				if (locale == null) {
					language = Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
				} else {
					language = locale.getLanguage() + "_" + locale.getCountry();
				}
			}

			String s = BaseUtils.class.getClassLoader().getResource("/").getPath().toString();
			s = java.net.URLDecoder.decode(s, "UTF-8");
			Properties properties = new Properties();
			if ("zh_CN".equals(language)) {
				messageStream = new FileInputStream(s + "/message_zh_CN.properties");
			} else if ("en_US".equals(language)) {
				messageStream = new FileInputStream(s + "/message_en_US.properties");
			} else {
				messageStream = new FileInputStream(s + "/message_zh_CN.properties");
			}
			properties.load(messageStream);
			if (properties.containsKey(key)) {
				String value = new String(properties.getProperty(key));
				return value;
			} else {
				return key;
			}
		} catch (Exception e) {
			return key;
		} finally {
			if (messageStream != null) {
				messageStream.close();
				messageStream = null;
			}
		}
	}

	public static String getPageMessage(String key, HttpSession session) throws Exception {

		FileInputStream messageStream = null;
		try {

			String language = "";
			if (session == null) {
				language = Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
			} else {
				Locale locale = (Locale) session.getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
				if (locale == null) {
					language = Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
				} else {
					language = locale.getLanguage() + "_" + locale.getCountry();
				}
			}

			String s = BaseUtils.class.getClassLoader().getResource("/").getPath().toString();
			s = java.net.URLDecoder.decode(s, "UTF-8");
			Properties properties = new Properties();
			if ("zh_CN".equals(language)) {
				messageStream = new FileInputStream(s + "/page_zh_CN.properties");
			} else if ("en_US".equals(language)) {
				messageStream = new FileInputStream(s + "/page_en_US.properties");
			} else {
				messageStream = new FileInputStream(s + "/page_zh_CN.properties");
			}
			properties.load(messageStream);
			if (properties.containsKey(key)) {
				String value = new String(properties.getProperty(key));
				return value;
			} else {
				return key;
			}
		} catch (Exception e) {
			return key;
		} finally {
			if (messageStream != null) {
				messageStream.close();
				messageStream = null;
			}
		}
	}

}

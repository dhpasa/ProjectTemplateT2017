package com.logictech.dwzq.core.util.io;

import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.logictech.dwzq.core.util.data.NumberUtils;
import com.logictech.dwzq.core.util.framework.Envir;


/**
 * [类名]<br>
 * MailUtil<br>
 * [功能概要]<br>
 * <br>
 * <br>
 * [変更履歴]<br>
 * 2009-3-16 ver1.00 新建 zhaoxinsheng<br>
 * 
 * @author FOUNDER CORPORATION
 * @version 1.00
 */
public class MailUtil {
	// logger
	protected static final Log log = LogFactory.getLog(MailUtil.class);

	final static MessageFormat FORMAT = new MessageFormat("");
	
	
	/**
	 * 发送邮件接口
	 * 
	 * @param key
	 *            mail.properties中key键
	 * @param subject
	 *            邮件主题
	 * @param to
	 *            收件人地址
	 * @param args
	 *            填充mail.properties中key键对应信息的占位符
	 * @throws UnsupportedEncodingException 
	 * @throws Exception
	 * @exception MessagingException
	 *                邮件过程中异常
	 */
	@SuppressWarnings({ "rawtypes"})
	public static void send(Map map) throws Exception{
		boolean sessionDebug = false;
		InternetAddress[] address = null;
		String to = (String) map.get("to");
		String cc = (String) map.get("cc");
		String subject = (String) map.get("subject");
		String message = (String) map.get("content");
		String batchFlag = (String) map.get("batchFlag");
		String from = (String) map.get("from");
//		List<String> fileNameList = (List<String>) map.get("attachment");
		ResourceBundle sysSetting = ResourceBundle.getBundle("system");
		
		if (!sysSetting.getString("mail.sendFlag").equals("true")) {
			return;
		}
		
//		String baseFilePath = sysSetting.getString("baseFilePath");
		
//		String mailSmtpFlag = (String) map.get("sendType");
		
		//服务器地址
		String mailServer = sysSetting.getString("mail.smtp.host");
		//验证
		String mailAuth = sysSetting.getString("mail.smtp.auth");
		//邮箱
		String mailAddress = sysSetting.getString("mail.smtp.form");
		//用户名
		String mailUser = sysSetting.getString("mail.smtp.user");
		//密码
		String mailPassword = sysSetting.getString("mail.smtp.password");
		//端口
		Integer port =  NumberUtils.stringToInt(sysSetting.getString("mail.smtp.port"), false);
		
		String userFilesAbsolutePath = "";
		if (batchFlag == null) {
			userFilesAbsolutePath = Envir.getHome();
		}
		String userFilesPath = "";

			Properties props = System.getProperties();
			props.put("mail.smtp.host", mailServer);
			props.put("mail.smtp.auth", mailAuth);

			Session mailSession = Session.getDefaultInstance(props, null);
			mailSession.setDebug(sessionDebug);

			Message msg = new MimeMessage(mailSession);
			msg.setFrom(new InternetAddress(mailAddress));

			address = InternetAddress.parse(to.replaceAll(";", ","), false);
			msg.setRecipients(Message.RecipientType.TO, address);
			if (null != cc) {
				address = InternetAddress.parse(cc.replaceAll(";", ","), false);
				msg.setRecipients(Message.RecipientType.CC, address);
			}
			Address adrFrom = new InternetAddress(mailAddress, from);
			msg.setFrom(adrFrom);
			
			msg.setSubject(subject);

			msg.setSentDate(new Date());
			
			//msg.setText(message);
			MimeMultipart test = new MimeMultipart();
			BodyPart mdp = new MimeBodyPart();// 新建一个存放信件内容的BodyPart对象
			String result = "";
			String tempName = "";
			String tempname2="";
			List<String> nameList = new ArrayList<String>();
			
			int s = message.indexOf("<img");
			int index = 1;
			if (s != -1) {
				while (s != -1) {
					int e = message.indexOf("/>",s);
					String before = message.substring(0,s-1);
					String after = message.substring(e);
					String middle = message.substring(s,e-1);
					middle.substring(0,middle.indexOf("src=\""));
					int m = middle.indexOf("src=\"");
					int t = middle.indexOf("\"",middle.indexOf("src=\"")+5);
					tempName = middle.substring(m,t);
					tempname2 = tempName.substring(5+userFilesPath.length());
					nameList.add(tempname2);
					result = before+ middle.substring(0,m-1)+"src=\"cid:"+String.valueOf(index)+".jpg"+middle.substring(t)+after;
					message = result;
					s = message.indexOf("<img", s+4);
					index++;
				}
			}
			else{
				result = message;
			}
			mdp.setContent(result, "text/html;charset=UTF-8");
			test.setSubType("related"); 
			
			test.addBodyPart(mdp);// 将含有信件内容的BodyPart加入到MimeMultipart对象中
			if (null != nameList && 0 < nameList.size()) {
				for(int i = 0; i < nameList.size(); i++){
					mdp = new MimeBodyPart();
					FileDataSource fds = new FileDataSource(userFilesAbsolutePath+nameList.get(i));
					DataHandler dh = new DataHandler(fds);
					mdp.setDataHandler(dh);
					mdp.setFileName(String.valueOf(i+1)+".jpg");// 可以和原文件名不一致
					mdp.setHeader("content-id", String.valueOf(i+1)+".jpg"); 
					test.addBodyPart(mdp);
				}
			}
//			if (fileNameList != null && fileNameList.size() > 0) {
//					for(String fileName:fileNameList){
//						mdp = new MimeBodyPart();
//						FileDataSource fds = new FileDataSource(baseFilePath+fileName);
//						DataHandler dh = new DataHandler(fds);
//						int i = fileName.lastIndexOf("/");
//						String name = fileName.substring(i+1);// 提取文件名
//						mdp.setDataHandler(dh);
//						mdp.setFileName(MimeUtility.encodeWord(name,"UTF-8","Q")); 
//						mdp.setHeader("content-id", name); 
//						test.addBodyPart(mdp);
//					}
//			}
			
			msg.setContent(test); 
			
			msg.saveChanges();

			Transport transport = mailSession.getTransport("smtp");
			
			transport.connect(mailServer, port, mailUser, mailPassword);
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();
		if (log.isDebugEnabled()) {
			log.debug("Send a mail to " + to);
		}
	}

	/**
	 * 发送邮件接口
	 * 
	 * @param key
	 *            mail.properties中key键
	 * @param subject
	 *            邮件主题
	 * @param to
	 *            收件人地址
	 * @param args
	 *            填充mail.properties中key键对应信息的占位符
	 * @throws Exception
	 * @exception MessagingException
	 *                邮件过程中异常
	 */
	public static void send(String to, String subject, String key, Object[] args) {

		boolean sessionDebug = false;
		InternetAddress[] address = null;
		ResourceBundle messages = ResourceBundle.getBundle("mail");

		FORMAT.applyPattern(messages.getString(key));
		String message = FORMAT.format(args);

		try {
			ResourceBundle sysSetting = ResourceBundle.getBundle("system");
			//服务器地址
			String mailServer = sysSetting.getString("mail.smtp.host");
			//验证
			String mailAuth = sysSetting.getString("mail.smtp.auth");
			//邮箱
			String mailAddress = sysSetting.getString("mail.smtp.form");
			//用户名
			String mailUser = sysSetting.getString("mail.smtp.user");
			//密码
			String mailPassword = sysSetting.getString("mail.smtp.password");
			
			Properties props = System.getProperties();
			props.put("mail.smtp.host", mailServer);
			props.put("mail.smtp.auth", mailAuth);

			Session mailSession = Session.getDefaultInstance(props, null);
			mailSession.setDebug(sessionDebug);

			Message msg = new MimeMessage(mailSession);
			msg.setFrom(new InternetAddress(mailAddress));

			address = InternetAddress.parse(to, false);
			msg.setRecipients(Message.RecipientType.TO, address);

			msg.setSubject(subject);

			//msg.setSentDate(new Date());
			
			msg.setText(message);
			Multipart test = new MimeMultipart();
			BodyPart mdp = new MimeBodyPart();// 新建一个存放信件内容的BodyPart对象
			mdp.setContent(message, "text/html;charset=UTF-8");
			test.addBodyPart(mdp);// 将含有信件内容的BodyPart加入到MimeMultipart对象中
			mdp = new MimeBodyPart();
			// String fname="c:\\salesforce\\csv\\"+subject+".csv";
			String fname = "d:\\kaoshi.docx";
			FileDataSource fds = new FileDataSource(fname);
			DataHandler dh = new DataHandler(fds);
			int i = fname.lastIndexOf("\\");
			String name = fname.substring(i+1);// 提取文件名
			mdp.setFileName(name);// 可以和原文件名不一致
			mdp.setDataHandler(dh);
			test.addBodyPart(mdp);
			msg.setContent(test);
			msg.saveChanges();

			Transport transport = mailSession.getTransport("smtp");
			transport.connect(mailServer, mailUser, mailPassword);
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();

		} catch (MessagingException e) {
			e.printStackTrace();
		}
		if (log.isDebugEnabled()) {
			log.debug("Send a mail to " + to);
		}
	}

	public static void recieve() {
		try {
			ResourceBundle sysSetting = ResourceBundle.getBundle("system");
			//服务器地址
			String mailServer = sysSetting.getString("mail.smtp.host");
			//验证
			String mailAuth = sysSetting.getString("mail.smtp.auth");
			//用户名
			String mailUser = sysSetting.getString("mail.smtp.user");
			//密码
			String mailPassword = sysSetting.getString("mail.smtp.password");
			
			Properties props = new Properties();
			props.put("mail.smtp.host", mailServer);
			props.put("mail.smtp.auth", mailAuth);

			Session session = Session.getDefaultInstance(props, null);

			Store store = session.getStore("pop3");
			store.connect(mailServer, mailUser, mailPassword);

			Folder folder = store.getFolder("INBOX");
			folder.open(Folder.READ_WRITE);

			Message message[] = folder.getMessages();

			for (int i = 0, n = message.length; i < n; i++) {
				//System.out.println(i + ": " + message[i].getFrom()[0] + "\t" + message[i].getSubject());
				Multipart test = (Multipart)message[i].getContent();
				int count = test.getCount();
				for (int j = 0; j < count; j++) {
					BodyPart mdp = test.getBodyPart(j);
					if (null != mdp.getDataHandler().getDataSource().getName()){
//						InputStream is = mdp.getDataHandler().getInputStream();
					}
				}
			}

			folder.close(true);
			store.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * 群发邮件接口
	 * 
	 * @param key
	 *            mail.properties中key键
	 * @param subject
	 *            邮件主题
	 * @param to
	 *            收件人地址
	 * @param args
	 *            填充mail.properties中key键对应信息的占位符
	 * @throws UnsupportedEncodingException 
	 * @throws Exception
	 * @exception MessagingException
	 *                邮件过程中异常
	 */
	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static int sendForBatch(String from, List<Map> dataList){
		int successCount = 0;
		boolean sessionDebug = false;
		InternetAddress[] address = null;
		String batchFlag = null;
		String to = null;
		String subject = null;
		String message = null;
		List<String> fileNameList = null;
		ResourceBundle sysSetting = ResourceBundle.getBundle("system");
		if (!sysSetting.getString("mail.sendFlag").equals("true")) {
			return 0;
		}
		
        //String baseFilePath = sysSetting.getString("baseFilePath");
		//服务器地址
		String mailServer = sysSetting.getString("mail.smtp.host");
		//验证
		String mailAuth = sysSetting.getString("mail.smtp.auth");
		//邮箱
		String mailAddress = sysSetting.getString("mail.smtp.form");;
		//用户名
		String mailUser = sysSetting.getString("mail.smtp.user");
		//密码
		String mailPassword = sysSetting.getString("mail.smtp.password");
		//端口
		Integer port =  NumberUtils.stringToInt(sysSetting.getString("mail.smtp.port"), false);
		String userFilesAbsolutePath = "";
		if (batchFlag == null) {
			// batch 处理错误
			// userFilesAbsolutePath = Envir.getHome();
		}
		String userFilesPath = "";
		Properties props = System.getProperties();
		props.put("mail.smtp.host", mailServer);
		props.put("mail.smtp.auth", mailAuth);

		Session mailSession = Session.getDefaultInstance(props, null);
		mailSession.setDebug(sessionDebug);
		
		try {
			Transport transport = mailSession.getTransport("smtp");
			
			transport.connect(mailServer, port, mailUser, mailPassword);
			for(Map map: dataList)
			{
				to = (String) map.get("to");
				subject = (String) map.get("subject");
				message = (String) map.get("content");
			    fileNameList = (List<String>) map.get("attachment");
				
				Message msg = new MimeMessage(mailSession);
				msg.setFrom(new InternetAddress(mailAddress));

				address = InternetAddress.parse(to.replaceAll(";", ","), false);
				msg.setRecipients(Message.RecipientType.TO, address);

				Address adrFrom = new InternetAddress(mailAddress, from);
				msg.setFrom(adrFrom);
				
				msg.setSubject(subject);

				msg.setSentDate(new Date());
				
				//msg.setText(message);
				MimeMultipart test = new MimeMultipart();
				BodyPart mdp = new MimeBodyPart();// 新建一个存放信件内容的BodyPart对象
				String result = "";
				String tempName = "";
				String tempname2="";
				List<String> nameList = new ArrayList<String>();
				
				int s = -1;//message.indexOf("<img");
				int index = 1;
				if (s != -1) {
					while (s != -1) {
						int e = message.indexOf("/>",s);
						String before = "";
						// 图片前有内容时，进行处理
						if (s > 0){
							before = message.substring(0,s-1);
						}
						String after = message.substring(e);
						String middle = message.substring(s,e-1);
						middle.substring(0,middle.indexOf("src=\""));
						int m = middle.indexOf("src=\"");
						int t = middle.indexOf("\"",middle.indexOf("src=\"")+5);
						tempName = middle.substring(m,t);
						tempname2 = tempName.substring(5+userFilesPath.length());
						nameList.add(tempname2);
						result = before+ middle.substring(0,m-1)+"src=\"cid:"+String.valueOf(index)+".jpg"+middle.substring(t)+after;
						message = result;
						s = message.indexOf("<img", s+4);
						index++;
					}
				}
				else{
					result = message;
				}
				mdp.setContent(result, "text/html;charset=UTF-8");
				test.setSubType("related"); 
				
				test.addBodyPart(mdp);// 将含有信件内容的BodyPart加入到MimeMultipart对象中
				if (null != nameList && 0 < nameList.size()) {
					for(int i = 0; i < nameList.size(); i++){
						mdp = new MimeBodyPart();
						FileDataSource fds = new FileDataSource(userFilesAbsolutePath+nameList.get(i));
						DataHandler dh = new DataHandler(fds);
						mdp.setDataHandler(dh);
						mdp.setFileName(String.valueOf(i+1)+".jpg");// 可以和原文件名不一致
						mdp.setHeader("content-id", String.valueOf(i+1)+".jpg"); 
						test.addBodyPart(mdp);
					}
				}
//			if (fileNameList != null && fileNameList.size() > 0) {
//					for(String fileName:fileNameList){
//						mdp = new MimeBodyPart();
//						FileDataSource fds = new FileDataSource(baseFilePath+fileName);
//						DataHandler dh = new DataHandler(fds);
//						int i = fileName.lastIndexOf("/");
//						String name = fileName.substring(i+1);// 提取文件名
//						mdp.setDataHandler(dh);
//						mdp.setFileName(MimeUtility.encodeWord(name,"UTF-8","Q")); 
//						mdp.setHeader("content-id", name); 
//						test.addBodyPart(mdp);
//					}
//			}				
				msg.setContent(test); 				
				msg.saveChanges();			
				transport.sendMessage(msg, msg.getAllRecipients());
				successCount++;
			}
			transport.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return successCount;
	}

	
	public static void main(String[] args) throws Exception {
		MailUtil.recieve();
	}
}

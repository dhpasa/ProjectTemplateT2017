package com.org.techcoffee.base.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailUtil extends BaseUtils{
	private static String mailServer;
	private static String mailAddress;
	private static String password;

	static {
		try {
			mailServer = BaseUtils.getApplicationMessage("mailServer", null);
			//mailServer = "mail.oztuantuan.com.au";
			mailAddress = BaseUtils.getApplicationMessage("mailAddress", null);
			//mailAddress = "info@oztuantuan.com.au";
			password = StringDecode.paramDecode(BaseUtils.getApplicationMessage("password", null));
			//password = "liuyuan19830808";		
		} catch (Exception e) {
			BaseUtils.logger.error("errorMsg", e);
		}
		
	}

	public static void sendMail(SendMailDto sendMailDto, List<String> paramList) throws Exception {
		try {
			Properties props = new Properties();
			//props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", mailServer);
			//props.put("mail.smtp.port", "587");
			props.put("mail.smtp.auth", "true");
			Session session = Session.getInstance(props);

			Transport transport = session.getTransport("smtp");
			transport.connect(mailServer, mailAddress, password);

			// 发送人
			MimeMessage message = new MimeMessage(session);
			InternetAddress mailFrom = new InternetAddress(mailAddress,
					mailAddress);
			message.setFrom(mailFrom);

			InternetAddress replyTo[] = { new InternetAddress(mailAddress) };

			message.setReplyTo(replyTo);

			// 接收地址
			InternetAddress[] mailAdresses = new InternetAddress[sendMailDto
					.getTo().size()];
			Iterator<?> it = sendMailDto.getTo().iterator();
			int times = 0;
			while (it.hasNext()) {
				String mailAdressTo = (String) it.next();
				InternetAddress mailTo = new InternetAddress(mailAdressTo);
				mailAdresses[times] = mailTo;
				times++;
			}
			message.addRecipients(Message.RecipientType.TO, mailAdresses);

			// 编码
			String title = sendMailDto.getTitle();
			message.setSubject(title, "utf-8");
			message.setSentDate(new Date());

			BodyPart mbp = new MimeBodyPart();
			String content = sendMailDto.getContent();
			if (paramList != null && paramList.size() > 0) {
				for (int i = 0; i < paramList.size(); i++) {
					content = content.replace("{" + i + "}", paramList.get(i));
				}
			}
			mbp.setContent(content, "text/html;charset=utf-8");
			Multipart mPart = new MimeMultipart();
			// mPart.addBodyPart(mbp);

			mPart.addBodyPart(mbp);
			if (!sendMailDto.getFile().isEmpty()) {
				Enumeration<String> efile = sendMailDto.getFile().elements();
				while (efile.hasMoreElements()) {
					mbp = new MimeBodyPart();
					String filename = efile.nextElement().toString();
					FileDataSource fds = new FileDataSource(filename);
					mbp.setDataHandler(new DataHandler(fds));
					mbp.setFileName(fds.getName());
					mPart.addBodyPart(mbp);
				}
				sendMailDto.getFile().removeAllElements();
			}
			message.setContent(mPart);

			// 送信
			message.saveChanges();

			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		MailUtil mailUtil = new MailUtil();
		SendMailDto sendMailDto = new SendMailDto();
		sendMailDto.setContent("test");
		sendMailDto.setTitle("06281111222233333");
		List<String> mailTo = new ArrayList<String>();
		mailTo.add("liuyuan1983@gmail.com");

		sendMailDto.setTo(mailTo);
		mailUtil.sendMail(sendMailDto, null);
	}
	
}

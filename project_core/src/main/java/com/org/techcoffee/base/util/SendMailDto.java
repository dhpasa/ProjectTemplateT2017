package com.org.techcoffee.base.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Vector;


public class SendMailDto implements Serializable{

	private static final long serialVersionUID = 1L;

	private Collection<?> to;
	private String title;
	private String content;
	private Vector<String> file = new Vector<String>();
	/**
	 * @return the file
	 */
	public Vector<String> getFile() {
		return file;
	}
	/**
	 * @param file the file to set
	 */
	public void setFile(Vector<String> file) {
		this.file = file;
	}
	/**
	 * @return the to
	 */
	public Collection<?> getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(Collection<?> to) {
		this.to = to;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

}

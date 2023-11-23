package com.mmkarami.jms.dto;

import java.io.Serializable;

public class MessageDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	public String subject;

	public String body;
	
	public MessageDTO() {
	}

	public MessageDTO(String subject, String body) {
		this.subject = subject;
		this.body = body;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
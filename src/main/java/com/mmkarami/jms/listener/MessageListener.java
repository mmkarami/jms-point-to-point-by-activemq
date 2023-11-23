package com.mmkarami.jms.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.mmkarami.jms.util.MessageConstant;

@Component
public class MessageListener {

	@JmsListener(destination = MessageConstant.QUEUE_NAME)
	public void consumeMessage() {
		System.out.print("Message is Consumed.");
	}
}
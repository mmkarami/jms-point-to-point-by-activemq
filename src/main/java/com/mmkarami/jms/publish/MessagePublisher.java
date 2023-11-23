package com.mmkarami.jms.publish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.mmkarami.jms.dto.MessageDTO;
import com.mmkarami.jms.util.MessageConstant;

@Component
public class MessagePublisher {

	@Autowired
	public JmsTemplate jmsTemplate;
	
	public void sendMessage(MessageDTO messageDTO) {
		jmsTemplate.convertAndSend(MessageConstant.QUEUE_NAME, messageDTO);
	}
}
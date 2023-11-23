package com.mmkarami.jms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mmkarami.jms.dto.MessageDTO;
import com.mmkarami.jms.publish.MessagePublisher;

@Controller
public class DashboardController {
	
	@Autowired
	MessagePublisher messagePublisher;

	@GetMapping("dashboard")
	public String showDashboard() {
		return "dashboard";
	}

	@PostMapping("dashboard")
	public void send(@RequestParam String subject, @RequestParam String body) {
		
		MessageDTO messageDTO = new MessageDTO(subject, body);
		messagePublisher.sendMessage(messageDTO);
	}
}
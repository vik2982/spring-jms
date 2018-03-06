package com.va.spring.jms;

import org.springframework.jms.core.JmsTemplate;

public class JmsSenderImpl implements JmsSender {
	
	private JmsTemplate jmsTemplate;
	
	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	
	public void sendMessage(String message){
		jmsTemplate.convertAndSend(message);
	}
}

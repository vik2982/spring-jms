package com.va.spring.jms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("jmsApplicationContext.xml");
		JmsSender jmsSender = context.getBean(JmsSenderImpl.class);
		jmsSender.sendMessage("**************************This is a test message from JmsSenderImpl *****************************");

	}

}

package com.va.spring.jms;

public class JmsReceiver  {
	
	public void handleMessage(Object message){
		System.out.println("JmsReceiver received the following message from the JMS queue: "+ message.toString());
	}

}

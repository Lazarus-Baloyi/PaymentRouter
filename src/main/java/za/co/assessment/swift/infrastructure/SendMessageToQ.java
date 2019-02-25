package za.co.assessment.swift.infrastructure;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@EnableJms
public class SendMessageToQ implements ISendMessageToQ {
	
    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue queue;
	
    @Value("${activemq.broker-url}")
    private String brokerUrl;
	
    @Override
    public void sendMessage(String queueName, Object content) {
    	jmsTemplate.convertAndSend(queueName, content);
    }
    
}

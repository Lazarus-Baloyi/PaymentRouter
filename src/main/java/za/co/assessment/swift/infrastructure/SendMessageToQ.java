package za.co.assessment.swift.infrastructure;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.handler.annotation.SendTo;

import za.co.assessment.swift.domain.MT101;
import za.co.assessment.swift.domain.MT195;

@EnableJms
public class SendMessageToQ {
	
    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue queue;
	
	private MT195 mt195;
    @Value("${activemq.broker-url}")
    private String brokerUrl;
	
	@SendTo("AcknowledgementQ")
	public MT195 sendMt195Message(String paymentStatus) {
		mt195.setTransactionReferenceNumber(paymentStatus);
		return mt195;
	}
	
	@SendTo("SettlementQ")
	public MT101 sendToSettlementEngine(MT101 mt101, String acknoledgeement) {
		mt101.setRestOfXmlMessage(acknoledgeement);
		return mt101;
	}
	

}

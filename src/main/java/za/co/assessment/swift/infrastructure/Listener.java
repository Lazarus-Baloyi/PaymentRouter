package za.co.assessment.swift.infrastructure;

import javax.jms.JMSException;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import za.co.assessment.swift.application.PaymentRouterApplication;
import za.co.assessment.swift.domain.MT101;

@Component
public class Listener {

	private PaymentRouterApplication paymentRouterApplication;
	
	@JmsListener(destination = "validated-payment-Q", containerFactory = "activeMQConnectionFactory")
    public void receiveMessage(MT101 mt101) throws JMSException{
		paymentRouterApplication.determineDestination(mt101);
    }	
	
	@JmsListener(destination = "message-status-Q", containerFactory = "activeMQConnectionFactory")
    public void retrieveMessageStatus(MT101 mt101) throws JMSException{
		paymentRouterApplication.determineDestination(mt101);
    }
}

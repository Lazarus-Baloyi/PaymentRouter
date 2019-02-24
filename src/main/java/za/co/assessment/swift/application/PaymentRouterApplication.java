package za.co.assessment.swift.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

import za.co.assessment.swift.domain.MT101;
import za.co.assessment.swift.infrastructure.SendMessageToQ;

@SpringBootApplication
@EnableJms
public class PaymentRouterApplication {

	private String paymentStatus;
	private SendMessageToQ sendMessageToQ;
	
	public static void main(String[] args) {
		SpringApplication.run(PaymentRouterApplication.class, args);
	}
	
	
	public void determineDestination(MT101 mt101) {
		paymentStatus = retreivePaymentStatus(mt101);
		sendMessageToQ.sendMt195Message(paymentStatus);
		
	}
	
	
	public String retreivePaymentStatus(MT101 mt101) {
		
		return mt101.getStatus();
	}

}

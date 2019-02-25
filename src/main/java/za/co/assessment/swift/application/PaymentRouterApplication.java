package za.co.assessment.swift.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import za.co.assessment.swift.domain.BusinessRulesResponseDto;
import za.co.assessment.swift.domain.MT101;
import za.co.assessment.swift.domain.MT195;
import za.co.assessment.swift.infrastructure.ISendMessageToQ;
import za.co.assessment.swift.infrastructure.RoutingRulesHelper;

@SpringBootApplication
public class PaymentRouterApplication {

	private String paymentStatus;
	private ISendMessageToQ sendMessageToQ;
	private RoutingRulesHelper routingRulesHelper;
	private String settlementEngine;
	private MT195 mt195;
	private BusinessRulesResponseDto businessRulesResponseDto;
	
	public static void main(String[] args) {
		SpringApplication.run(PaymentRouterApplication.class, args);
		
	}
	
	
	public void determineDestination(MT101 mt101) {
		paymentStatus = retreivePaymentStatus(mt101);
		sendMessageToQ.sendMessage("AcknowledgementQ", mt195);
		if(!"REJECTED".equalsIgnoreCase(paymentStatus.trim())) {
			businessRulesResponseDto = routingRulesHelper.getDestinationFromBusinessRules(mt101);
			settlementEngine = businessRulesResponseDto.getSettlementEngine();
			if(null != settlementEngine) {
				sendMessageToQ.sendMessage(settlementEngine, mt101);
				mt195.setAckNak(businessRulesResponseDto.getAckNak());
			}

			sendMessageToQ.sendMessage("AcknowledgementQ", mt195);
		}
	}
	
	
	public String retreivePaymentStatus(MT101 mt101) {
		
		return mt101.getStatus();
	}

}

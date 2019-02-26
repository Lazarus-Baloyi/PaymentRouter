package za.co.assessment.swift.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import za.co.assessment.swift.domain.BusinessRulesResponseDto;
import za.co.assessment.swift.domain.MT101;
import za.co.assessment.swift.domain.MT195;
import za.co.assessment.swift.domain.MessageStatusDto;
import za.co.assessment.swift.infrastructure.ISendMessageToQ;
import za.co.assessment.swift.infrastructure.RoutingRulesHelper;

@SpringBootApplication
public class PaymentRouterApplication {

	private String paymentMessageStatus;
	private ISendMessageToQ sendMessageToQ;
	private RoutingRulesHelper routingRulesHelper;
	private String settlementEngine, messageStatus;
	private MT195 mt195;
	private BusinessRulesResponseDto businessRulesResponseDto;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(PaymentRouterApplication.class, args);
		
	}
	
	
	public void determineDestination(MT101 mt101) {
		try {
			paymentMessageStatus = retreivePaymentStatus(mt101.getTransactionReference());
			sendMessageToQ.sendMessage("AcknowledgementQ", mt195);
			if(!"REJECTED".equalsIgnoreCase(paymentMessageStatus.trim())) {
				businessRulesResponseDto = routingRulesHelper.getDestinationFromBusinessRules(mt101);
				settlementEngine = businessRulesResponseDto.getSettlementEngine();
				if(null != settlementEngine) {
					sendMessageToQ.sendMessage(settlementEngine, mt101);
					mt195.setAckNak(businessRulesResponseDto.getAckNak());
				}
	
				sendMessageToQ.sendMessage("AcknowledgementQ", mt195);
			}
		}	
		catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	
	public String retreivePaymentStatus(String transactioReference) {
		//some logic to retrieve payment status and link it to the payment message
		return messageStatus;
	}
	
	public void storePaymentStatus() {
		//some logic to save MessageStatusDto to DB
	}

}

package za.co.assessment.swift.domain;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class BusinessRulesResponseDto {

	private String settlementEngine;
	private String ackNak;
	public String getSettlementEngine() {
		return settlementEngine;
	}
	public void setSettlementEngine(String settlementEngine) {
		this.settlementEngine = settlementEngine;
	}
	public String getAckNak() {
		return ackNak;
	}
	public void setAckNak(String ackNak) {
		this.ackNak = ackNak;
	}
	@Override
	public String toString() {
		return "BusinessRulesResponseDto [settlementEngine=" + settlementEngine + ", ackNak=" + ackNak + "]";
	}
	
	
	
}

package za.co.assessment.swift.infrastructure;

public interface ISendMessageToQ {

	public void sendMessage(String queue, Object content);
	
}

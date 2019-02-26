package za.co.assessment.swift.domain;

public class MessageStatusDto {
	
	private String messageReference;
	private String messageStatus;
	
	
	
	public MessageStatusDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public MessageStatusDto(String messageReference, String messageStatus) {
		super();
		this.messageReference = messageReference;
		this.messageStatus = messageStatus;
	}



	public String getMessageReference() {
		return messageReference;
	}
	public void setMessageReference(String messageReference) {
		this.messageReference = messageReference;
	}
	public String getMessageStatus() {
		return messageStatus;
	}
	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}
	@Override
	public String toString() {
		return "MessageStatusDto [messageReference=" + messageReference + ", messageStatus=" + messageStatus + "]";
	}

	
}

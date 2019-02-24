package za.co.assessment.swift.domain;

public class MT101 {
	
	private String senderReference;
	private int messageIndex;
	private String orderingCustomer;
	private String requestedExecutionDate;
	private String transactionReference;
	private String transactionCurrencyAmount;
	private String beneficiary;
	private String chargesDetail;
	private String idType;
	private String restOfXmlMessage;
	private String status;
	
	
	public MT101(String senderReference, int messageIndex, String orderingCustomer, String requestedExecutionDate,
			String transactionReference, String transactionCurrencyAmount, String beneficiary, String chargesDetail,
			String idType, String restOfXmlMessage, String status) {
		super();
		this.senderReference = senderReference;
		this.messageIndex = messageIndex;
		this.orderingCustomer = orderingCustomer;
		this.requestedExecutionDate = requestedExecutionDate;
		this.transactionReference = transactionReference;
		this.transactionCurrencyAmount = transactionCurrencyAmount;
		this.beneficiary = beneficiary;
		this.chargesDetail = chargesDetail;
		this.idType = idType;
		this.restOfXmlMessage = restOfXmlMessage;
		this.status = status;
	}

		
		public MT101() {
		
		}



	public String getSenderReference() {
		return senderReference;
	}

	public void setSenderReference(String senderReference) {
		this.senderReference = senderReference;
	}

	public int getMessageIndex() {
		return messageIndex;
	}

	public void setMessageIndex(int messageIndex) {
		this.messageIndex = messageIndex;
	}

	public String getOrderingCustomer() {
		return orderingCustomer;
	}

	public void setOrderingCustomer(String orderingCustomer) {
		this.orderingCustomer = orderingCustomer;
	}

	public String getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(String requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
	}

	public String getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}

	public String getTransactionCurrencyAmount() {
		return transactionCurrencyAmount;
	}

	public void setTransactionCurrencyAmount(String transactionCurrencyAmount) {
		this.transactionCurrencyAmount = transactionCurrencyAmount;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getChargesDetail() {
		return chargesDetail;
	}

	public void setChargesDetail(String chargesDetail) {
		this.chargesDetail = chargesDetail;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getRestOfXmlMessage() {
		return restOfXmlMessage;
	}

	public void setRestOfXmlMessage(String restOfXmlMessage) {
		this.restOfXmlMessage = restOfXmlMessage;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "MT101 [senderReference=" + senderReference + ", messageIndex=" + messageIndex + ", orderingCustomer="
				+ orderingCustomer + ", requestedExecutionDate=" + requestedExecutionDate + ", transactionReference="
				+ transactionReference + ", transactionCurrencyAmount=" + transactionCurrencyAmount + ", beneficiary="
				+ beneficiary + ", chargesDetail=" + chargesDetail + ", idType=" + idType + ", restOfXmlMessage="
				+ restOfXmlMessage + ", status=" + status + "]";
	}
	
	
}

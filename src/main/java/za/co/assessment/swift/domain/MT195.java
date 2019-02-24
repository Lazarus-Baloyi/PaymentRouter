package za.co.assessment.swift.domain;

public class MT195 {
	private String transactionReferenceNumber;
	private String relatedReference;
	private String queries;
	private String restOfXmlMessage;

	
	public MT195() {

	}
	
	public MT195(String transactionReferenceNumber, String relatedReference, String queries, String restOfXmlMessage) {
		super();
		this.transactionReferenceNumber = transactionReferenceNumber;
		this.relatedReference = relatedReference;
		this.queries = queries;
		this.restOfXmlMessage = restOfXmlMessage;
	}

	public String getTransactionReferenceNumber() {
		return transactionReferenceNumber;
	}
	public void setTransactionReferenceNumber(String transactionReferenceNumber) {
		this.transactionReferenceNumber = transactionReferenceNumber;
	}
	public String getRelatedReference() {
		return relatedReference;
	}
	public void setRelatedReference(String relatedReference) {
		this.relatedReference = relatedReference;
	}
	public String getQueries() {
		return queries;
	}
	public void setQueries(String queries) {
		this.queries = queries;
	}
	public String getRestOfXmlMessage() {
		return restOfXmlMessage;
	}
	public void setRestOfXmlMessage(String restOfXmlMessage) {
		this.restOfXmlMessage = restOfXmlMessage;
	}
	@Override
	public String toString() {
		return "MT195 [transactionReferenceNumber=" + transactionReferenceNumber + ", relatedReference="
				+ relatedReference + ", queries=" + queries + ", restOfXmlMessage=" + restOfXmlMessage + "]";
	}
	
	
	
	
}

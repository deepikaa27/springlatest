package com.scb.guass.model;

public class Interests {
private String rateId;
private String interestType;
private String creditPercent;
private String debitPercent;
public Interests(String rateId, String interestType, String creditPercent, String debitPercent) {
	super();
	this.rateId = rateId;
	this.interestType = interestType;
	this.creditPercent = creditPercent;
	this.debitPercent = debitPercent;
}
public String getRateId() {
	return rateId;
}
public void setRateId(String rateId) {
	this.rateId = rateId;
}
public String getInterestType() {
	return interestType;
}
public void setInterestType(String interestType) {
	this.interestType = interestType;
}
public String getCreditPercent() {
	return creditPercent;
}
public void setCreditPercent(String creditPercent) {
	this.creditPercent = creditPercent;
}
public String getDebitPercent() {
	return debitPercent;
}
public void setDebitPercent(String debitPercent) {
	this.debitPercent = debitPercent;
}
public Interests() {
	super();
}
@Override
public String toString() {
	return "Interests [rateId=" + rateId + ", interestType=" + interestType + ", creditPercent=" + creditPercent
			+ ", debitPercent=" + debitPercent + "]";
}


}

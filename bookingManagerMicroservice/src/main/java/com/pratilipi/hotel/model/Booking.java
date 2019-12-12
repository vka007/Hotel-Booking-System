package com.pratilipi.hotel.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Booking {
	
	@Id
	String id;
	
	String custFullName;
	String custEmail;
	String custPhone;
	String custUserId;
	
	int totalNights;
	Long totalPrice;
	
	public Booking(String custFullName, String custEmail, String custPhone, String custUserId, int totalNights) {
		//super();
		this.custFullName = custFullName;
		this.custEmail = custEmail;
		this.custPhone = custPhone;
		this.custUserId = custUserId;
		this.totalNights = totalNights;
	}


	public String getCustFullName() {
		return custFullName;
	}

	public void setCustFullName(String custFullName) {
		this.custFullName = custFullName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public String getCustUserId() {
		return custUserId;
	}

	public void setCustUserId(String custUserId) {
		this.custUserId = custUserId;
	}

	public int getTotalNights() {
		return totalNights;
	}

	public void setTotalNights(int totalNights) {
		this.totalNights = totalNights;
	}
	
	public Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Booking [custFullName=" + custFullName + ", custEmail=" + custEmail + ", custPhone=" + custPhone
				+ ", custUserId=" + custUserId + ", totalNights=" + totalNights + ", totalPrice=" + totalPrice + "]";
	}
		

}

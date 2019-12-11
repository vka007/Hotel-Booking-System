package com.pratilipi.hotel.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Price {

	@Id
	String id;
	
	String roomType;
	Long roomPrice;
	
	public Price(String roomType, Long roomPrice) {
		super();
		this.roomType = roomType;
		this.roomPrice = roomPrice;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Long getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Long roomPrice) {
		this.roomPrice = roomPrice;
	}

	@Override
	public String toString() {
		return "Price [roomType=" + roomType + ", roomPrice=" + roomPrice + "]";
	}
	
	
	
	
	
}

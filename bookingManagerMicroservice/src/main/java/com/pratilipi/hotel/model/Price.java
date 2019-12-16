package com.pratilipi.hotel.model;

public class Price {
	
	String roomType;
	String roomPrice;
	
	public Price()
	{
		super();
	}
	
	public Price(String roomType, String roomPrice) {
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

	public String getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(String roomPrice) {
		this.roomPrice = roomPrice;
	}

	@Override
	public String toString() {
		return "Price [roomType=" + roomType + ", roomPrice=" + roomPrice + "]";
	}
	
}

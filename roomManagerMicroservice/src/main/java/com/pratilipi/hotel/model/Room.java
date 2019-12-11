package com.pratilipi.hotel.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Room {

	@Id
	String id;
	String roomName;
	String roomType;
	
	public Room(String roomName, String roomType) {
		super();
		this.roomName = roomName;
		this.roomType = roomType;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	@Override
	public String toString() {
		return "Room [roomName=" + roomName + ", roomType=" + roomType + "]";
	}
	
	
	
	
	
	
}

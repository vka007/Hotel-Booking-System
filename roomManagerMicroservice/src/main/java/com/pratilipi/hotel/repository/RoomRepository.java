package com.pratilipi.hotel.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pratilipi.hotel.model.Room;

@Repository
public interface RoomRepository extends MongoRepository<Room, String> {
	
	
	public Room findByRoomName(String roomName);
	
	public List<Room> findByRoomType(String roomType);
	
	
	

}

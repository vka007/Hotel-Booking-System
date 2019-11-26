package com.pratilipi.hotel.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pratilipi.hotel.model.Hotel;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {
	
	public Hotel findByName(String name);
	public List<Hotel> findByCity(String city);
}

package com.pratilipi.hotel.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pratilipi.hotel.model.Price;

@Repository
public interface PriceRepository extends MongoRepository<Price, String>{

	public Price findByRoomType(String roomType);
	public List<Price> findByRoomPrice(Long roomPrice); 
}

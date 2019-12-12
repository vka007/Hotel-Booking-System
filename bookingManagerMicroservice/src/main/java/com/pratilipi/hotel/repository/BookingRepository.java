package com.pratilipi.hotel.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pratilipi.hotel.model.Booking;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String>{

	public Booking findByCustFullName(String custFullName);
	
	public List<Booking> findByCustUserId(String custUserId);

}

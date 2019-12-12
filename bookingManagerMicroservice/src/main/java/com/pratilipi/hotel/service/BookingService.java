package com.pratilipi.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratilipi.hotel.model.Booking;
import com.pratilipi.hotel.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	//create a Booking
	public Booking create(String custFullName, String custEmail, String custPhone, String custUserId, int totalNights)
	{
		return bookingRepository.save(new Booking(custFullName, custEmail, custPhone, custUserId, totalNights));
		
	}	
	
	//Retrieve the Booking Details
	public List<Booking> getAll()
	{
		return bookingRepository.findAll();
	}
	
	
	public Booking getByCustFullName(String custFullName)
	{
		return bookingRepository.findByCustFullName(custFullName);
	}
	
	//update Booking Details
	public Booking update(String custFullName, String custEmail, String custPhone, String custUserId, int totalNights)
	{
		Booking b = bookingRepository.findByCustFullName(custFullName);
		b.setCustEmail(custEmail);
		b.setCustPhone(custPhone);
		b.setCustUserId(custUserId);
		b.setTotalNights(totalNights);
		
		return bookingRepository.save(b);
	}
	
		
	//Delete All Room Details
	public void deleteAll()
	{
		bookingRepository.deleteAll();
	}
	
	public void delete(String custFullName)
	{
		Booking b = bookingRepository.findByCustFullName(custFullName);
		bookingRepository.delete(b);
	}
		
}

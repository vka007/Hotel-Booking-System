package com.pratilipi.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratilipi.hotel.model.Hotel;
import com.pratilipi.hotel.repository.HotelRepository;

@Service
public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	//Create a new Hotel Details
	public Hotel create(String name, String address, String city, String state,	String country,
	int zipCode, Long phoneNumber,	String email)
	{
		return hotelRepository.save(new Hotel(name, address, city, state, country, 
				zipCode, phoneNumber, email));
	}

	//Retrieve Hotel Data
	public List<Hotel> getAll()
	{
		return hotelRepository.findAll();
	}
	
	public Hotel getByName(String name)
	{
		return hotelRepository.findByName(name);
	}
	
	//Update Hotel Details
	public Hotel update(String name, String address, String city, String state,	String country,
	int zipCode, Long phoneNumber,	String email)
	{
		Hotel h = hotelRepository.findByName(name);
		h.setName(name);
		h.setAddress(address);
		h.setCity(city);
		h.setState(state);
		h.setCountry(country);
		h.setZipCode(zipCode);
		h.setPhoneNumber(phoneNumber);
		h.setEmail(email);
		
		return hotelRepository.save(h);
	}
	
	//Delete Hotel Data	
	public void deleteAll()
	{
		hotelRepository.deleteAll();
	}
	
	public void delete(String name)
	{
		Hotel h = hotelRepository.findByName(name);
		hotelRepository.delete(h);
	}
	
}

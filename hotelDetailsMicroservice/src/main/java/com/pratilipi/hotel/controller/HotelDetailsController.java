package com.pratilipi.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pratilipi.hotel.model.Hotel;
import com.pratilipi.hotel.service.HotelService;

@RestController
public class HotelDetailsController {
	
	@Autowired
	private HotelService hotelService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String name,@RequestParam String address,@RequestParam String city,
			@RequestParam String state,@RequestParam String country,@RequestParam int zipCode,
			@RequestParam Long phoneNumber,@RequestParam String email)
	{
		Hotel h = hotelService.create(name, address, city, state, country, zipCode, phoneNumber, email);
		return h.toString();
	}
	
	@RequestMapping("/get")
	public Hotel getHotel(@RequestParam String name)
	{
		return hotelService.getByName(name);
	}
	
	@RequestMapping("/getAll")
	public List<Hotel> getAll()
	{
		return hotelService.getAll();
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam String name,@RequestParam String address,@RequestParam String city,
			@RequestParam String state,@RequestParam String country,@RequestParam int zipCode,
			@RequestParam Long phoneNumber,@RequestParam String email)
	{
		Hotel h = hotelService.update(name, address, city, state, country, zipCode, phoneNumber, email);
		return h.toString();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String name)
	{
		hotelService.delete(name);
		return name+" : Hotel Details Deleted";
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll()
	{
		hotelService.deleteAll();
		return "All Hotel Details Deleted";
	}
	
	
	

}

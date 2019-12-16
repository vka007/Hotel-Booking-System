package com.pratilipi.hotel.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.pratilipi.hotel.model.Booking;
import com.pratilipi.hotel.model.Price;
import com.pratilipi.hotel.service.BookingService;


@RestController
public class BookingController {
	
	public int totprice;
		
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private RestTemplate restTemplate;
		
	
	@GetMapping("/priceList")
	public String getPrice(@RequestParam String roomType)
	{
		String url = "http://localhost:8082/get?roomType="+roomType;
				
		String str = restTemplate.getForObject(url, String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		
		int price=0;
		
		try {
			Price p = mapper.readValue(str, Price.class);
			
			price = Integer.parseInt(p.getRoomPrice());
			
			//System.out.println(price);
			
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		this.totprice = price;	
		
		int finalPrice = Booking.nights * price;
		
		return "$ "+price+"/Night" + " | Total price = $"+finalPrice ;
		
	}
	
	@RequestMapping("/create")
	public String create(@RequestParam String custFullName, @RequestParam String custEmail, @RequestParam String custPhone, 
			@RequestParam String custUserId, @RequestParam int totalNights )
	{
		Booking b = bookingService.create(custFullName, custEmail, custPhone, custUserId, totalNights);
		return b.toString();
	}
	

	@RequestMapping("/get")
	public Booking getBooking(@RequestParam String custFullName)
	{
		return bookingService.getByCustFullName(custFullName);
	}
	
	@RequestMapping("/getAll")
	public List<Booking> getAll()
	{
		return bookingService.getAll();
	}
	
	
	@RequestMapping("/update")
	public String update(@RequestParam String custFullName, @RequestParam String custEmail, @RequestParam String custPhone, 
			@RequestParam String custUserId, @RequestParam int totalNights)
	{
		Booking b = bookingService.update(custFullName, custEmail, custPhone, custUserId, totalNights);
		return b.toString();
	}
	
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String custFullName)
	{
		bookingService.delete(custFullName);
		return custFullName+ " Your Booking is Cancelled/Removed";
	}
	
	
	@RequestMapping("/deleteAll")
	public String deleteAll()
	{
		bookingService.deleteAll();
		return "All booking Details Deleted";
	}


}

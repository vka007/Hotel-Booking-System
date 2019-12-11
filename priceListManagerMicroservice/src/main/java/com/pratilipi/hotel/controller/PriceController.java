package com.pratilipi.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pratilipi.hotel.model.Price;
import com.pratilipi.hotel.service.PriceService;

@RestController
public class PriceController {
	
	@Autowired
	private PriceService priceService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String roomType, @RequestParam Long roomPrice)
	{
		Price p = priceService.create(roomType, roomPrice);
		return p.toString();
		
	}
	
	@RequestMapping("/get")
	public Price getPrice(@RequestParam String roomType)
	{
		return priceService.getByRoomType(roomType);
	}
	
	@RequestMapping("/getAll")
	public List<Price> getAll()
	{
		return priceService.getAll();
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam String roomType, @RequestParam Long roomPrice)
	{
		Price p = priceService.update(roomType, roomPrice);
		return p.toString();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String roomType)
	{
	priceService.delete(roomType);
		return roomType+" is deleted";
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll()
	{
		priceService.deleteAlll();
		return "All Price details deleted";
	}
	
	

}

package com.pratilipi.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratilipi.hotel.model.Price;
import com.pratilipi.hotel.repository.PriceRepository;

@Service
public class PriceService {
	
	@Autowired
	private PriceRepository priceRepository;
	
	//create a Price
		public Price create(String roomType, Long roomPrice)
		{
			return priceRepository.save(new Price( roomType, roomPrice));
		}
		
		//Retrieve the Price details
		public List<Price> getAll()
		{
			return priceRepository.findAll();
		}
		
		public Price getByRoomType(String roomType)
		{
			return priceRepository.findByRoomType(roomType);
		}
		
		//update Price Details
		public Price update(String roomType, Long roomPrice)
		{
			Price p = priceRepository.findByRoomType(roomType);
			p.setRoomPrice(roomPrice);
			return priceRepository.save(p);
		}
		
		//Delete All Room Details
		public void deleteAlll()
		{
			priceRepository.deleteAll();
		}
		
		public void delete(String roomType)
		{
			Price p = priceRepository.findByRoomType(roomType);
			priceRepository.delete(p);
		}
		

}

package com.cct.garageger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cct.garageger.model.Booking;
import com.cct.garageger.repository.BookingRepository;

@Controller
@RequestMapping("booking")
public class BookingController {
	
	@Autowired
	private BookingRepository bookings;
	
	@RequestMapping
	public String booking() {
		return "booking";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String insertData(Booking booking) {

		booking.setDescription_problem("teste");
		booking.setStatus("status");
					
		bookings.save(booking);		
		return "booking";
	}

}

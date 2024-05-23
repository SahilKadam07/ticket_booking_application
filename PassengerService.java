package com.ticketBookingApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketBookingApp.entity.Passenger;
import com.ticketBookingApp.repository.PassengerRepo;

@Service
public class PassengerService {
	
	@Autowired
	private PassengerRepo passengerRepo;
	
	public void savePassenger(Passenger pass)
	{
		passengerRepo.save(pass);
	}
	
	public List<Passenger> getAllPassengers()
	  {
		  return passengerRepo.findAll();
	  }

}

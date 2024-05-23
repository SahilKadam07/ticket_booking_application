package com.ticketBookingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketBookingApp.entity.MyTrain;
import com.ticketBookingApp.repository.MyTrainRepo;

@Service
public class MyTrainService {
	
	@Autowired
	private MyTrainRepo trainRepo;

	public void saveMyTrain(MyTrain mytrain)
	{
		trainRepo.save(mytrain);
	}
}

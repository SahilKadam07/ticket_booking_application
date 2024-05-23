package com.ticketBookingApp.service;

 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
 
 import org.springframework.stereotype.Service;

import com.ticketBookingApp.entity.Bus;
import com.ticketBookingApp.entity.Train;
import com.ticketBookingApp.repository.BusRepo;
import com.ticketBookingApp.repository.TrainRepo;
  
 @Service 
 public class TrainServ {
  
 @Autowired 
 private TrainRepo repo;
 
 @Autowired
 private BusRepo repo1;

  public void saveDetails(Train trains) {
	  
	  repo.save(trains); 
	  
  }
  
  public List<Train> getAllTrain()
  {
	  return repo.findAll();
  }
  
  
public void saveDetails(Bus bus) {
	  
	repo1.save(bus);
	  
  }
  
  public List<Bus> getAllBus()
  {
	  return repo1.findAll();
  }
  
  public Train getTrainById(int train_no)
  {
	  return repo.findById(train_no).get();
  }
  
 }
 
package com.ticketBookingApp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ticketBookingApp.entity.Bus;
import com.ticketBookingApp.entity.MyTrain;
import com.ticketBookingApp.entity.Passenger;
import com.ticketBookingApp.entity.Train;
import com.ticketBookingApp.service.MyTrainService;
import com.ticketBookingApp.service.PassengerService;
import com.ticketBookingApp.service.TrainServ;


@Controller
public class BookingControl {

	
	 @Autowired 
	 private TrainServ serv;
	 
	 @Autowired
	 private PassengerService passengerService;
	 
	 @Autowired
	 private MyTrainService trainService;
	 
	
	@GetMapping()
	public String Home()
	{
		return "home";
	}

	@GetMapping("/train_details")
	public String addTrain()
	{
		return "trainDetails";
	}
	
	@GetMapping("/bus_details")
	public String addBus()
	{
		return "busDetails";
	}
	
	@GetMapping("/availble_trains")
	public ModelAndView availableTrains()
	{
		List<Train> list = serv.getAllTrain();
		/*
		 * ModelAndView view = new ModelAndView(); 
		 * view.setViewName("trainList");
		 * view.addObject("train",list);
		 */
		return new ModelAndView("trainList","train",list);
	}
	
	@GetMapping("/availble_buses")
	public ModelAndView availableBus()
	{
		List<Bus> list1 = serv.getAllBus();
		return new ModelAndView("busesList","bus",list1);
	}

	 @PostMapping("/save") 
	 public String saveTrain(@ModelAttribute Train trains)
	 {
		 this.serv.saveDetails(trains);
		 return "redirect:/availble_trains"; 
	 }
	  
	 @PostMapping("/savebus") 
	 public String saveBus(@ModelAttribute Bus buses)
	 {
		 this.serv.saveDetails(buses);
		 return "redirect:/availble_buses"; 
	 }
	 
	 @GetMapping("/passenger_details")
		public String addPassenger()
		{
		 return "addPassenger";
		}
	 
	 @PostMapping("/savePassenger") 
	 public String saveTrain(@ModelAttribute Passenger passenger)
	 {
		 this.passengerService.savePassenger(passenger);
		 return "redirect:/passanger_info"; 
	 }
	
	 @GetMapping("/passanger_info")
	 public ModelAndView getAllPassenger()
	 {
		 List<Passenger> list3 = passengerService.getAllPassengers();
		 return new ModelAndView("myBookings","passenger",list3);
	 }

	 
	 //to show train name
	 
	 @RequestMapping("/mytrain/{id}")
	 public String getMyTrain(@PathVariable("id") int train_no)
	 {
		 Train train = serv.getTrainById(train_no);
		 MyTrain mytrain = new MyTrain(train.getTrain_no(),train.getTrain_name());
		 trainService.saveMyTrain(mytrain);
		 return "redirect:/passenger_details";
	 }
	 
}

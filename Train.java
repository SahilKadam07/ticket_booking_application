package com.ticketBookingApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Train {
	
	@Id
	private int train_no;
	private String train_name;
	private String train_time;
	private String departure;
	private String destination;
	
	
	
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(int train_no, String train_name, String train_time, String departure, String destination) {
		super();
		this.train_no = train_no;
		this.train_name = train_name;
		this.train_time = train_time;
		this.departure = departure;
		this.destination = destination;
	}

	public int getTrain_no() {
		return train_no;
	}

	public void setTrain_no(int train_no) {
		this.train_no = train_no;
	}

	public String getTrain_name() {
		return train_name;
	}

	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}

	public String getTrain_time() {
		return train_time;
	}

	public void setTrain_time(String train_time) {
		this.train_time = train_time;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	

}

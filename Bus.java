package com.ticketBookingApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bus {
	
	@Id
	private int bus_no;
	private String bus_type;
	private String bus_time;
	private String departure;
	private String destination;
	
	public Bus(int bus_no, String bus_type, String bus_time, String departure, String destination) {
		super();
		this.bus_no = bus_no;
		this.bus_type = bus_type;
		this.bus_time = bus_time;
		this.departure = departure;
		this.destination = destination;
	}

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBus_no() {
		return bus_no;
	}

	public void setBus_no(int bus_no) {
		this.bus_no = bus_no;
	}

	public String getBus_type() {
		return bus_type;
	}

	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}

	public String getBus_time() {
		return bus_time;
	}

	public void setBus_time(String bus_time) {
		this.bus_time = bus_time;
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

	@Override
	public String toString() {
		return "Bus [bus_no=" + bus_no + ", bus_type=" + bus_type + ", bus_time=" + bus_time + ", departure="
				+ departure + ", destination=" + destination + "]";
	}
	
	

}

package com.ticketBookingApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MyTrain {

	@Id
	private int train_no;
	private String train_name;
	
	public MyTrain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyTrain(int train_no, String train_name) {
		super();
		this.train_no = train_no;
		this.train_name = train_name;
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

	
	
	
}

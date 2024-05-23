package com.ticketBookingApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int s_no;
	private String p_name;
	private String p_age;
	private String p_gender;
	
	
	public Passenger(int s_no, String p_name, String p_age, String p_gender) {
		super();
		this.s_no = s_no;
		this.p_name = p_name;
		this.p_age = p_age;
		this.p_gender = p_gender;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_age() {
		return p_age;
	}
	public void setP_age(String p_age) {
		this.p_age = p_age;
	}
	public String getP_gender() {
		return p_gender;
	}
	public void setP_gender(String p_gender) {
		this.p_gender = p_gender;
	}
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

}

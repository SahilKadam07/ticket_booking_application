package com.ticketBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketBookingApp.entity.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, String> {

}

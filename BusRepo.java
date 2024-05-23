package com.ticketBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketBookingApp.entity.Bus;

@Repository
public interface BusRepo extends JpaRepository<Bus, Integer> {

}

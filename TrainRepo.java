package com.ticketBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketBookingApp.entity.Train;

@Repository
public interface TrainRepo extends JpaRepository<Train, Integer>
{

}

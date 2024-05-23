package com.ticketBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketBookingApp.entity.MyTrain;

@Repository
public interface MyTrainRepo extends JpaRepository<MyTrain, Integer> {

}

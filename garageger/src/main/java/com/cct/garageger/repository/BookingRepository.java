package com.cct.garageger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cct.garageger.model.Booking;

//This class represents a generic DAO

public interface BookingRepository extends JpaRepository<Booking, Long>{

}

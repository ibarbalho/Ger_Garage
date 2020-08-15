package com.cct.garageger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cct.garageger.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

}

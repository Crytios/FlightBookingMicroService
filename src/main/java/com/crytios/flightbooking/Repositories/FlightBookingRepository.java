package com.crytios.flightbooking.Repositories;

import java.util.List;

import com.crytios.flightbooking.Models.FlightBooking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, String> {

    List<FlightBooking> findByPassengerId(String passengerId);
}
package com.crytios.flightbooking.Repositories;

import com.crytios.flightbooking.Models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, String> {

    List<Flight> findByDepartureAndDepartureDateGreaterThan(String departure, LocalDateTime departureDate);
}

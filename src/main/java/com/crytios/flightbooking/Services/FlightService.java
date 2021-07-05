package com.crytios.flightbooking.Services;

import java.util.List;
import java.util.Optional;

import com.crytios.flightbooking.Models.Flight;

public interface FlightService {

    Optional<Flight> getFlightById(String flightId);

    List<Flight> getAllFlights();
}

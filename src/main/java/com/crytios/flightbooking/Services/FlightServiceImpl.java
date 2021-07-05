package com.crytios.flightbooking.Services;

import java.util.List;
import java.util.Optional;

import com.crytios.flightbooking.Models.Flight;
import com.crytios.flightbooking.Repositories.FlightRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepo;

    @Override
    public Optional<Flight> getFlightById(String flightId) {
        return flightRepo.findById(flightId);
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepo.findAll();
    }

}

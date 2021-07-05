package com.crytios.flightbooking.Controller;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import com.crytios.flightbooking.Models.Flight;
import com.crytios.flightbooking.Services.FlightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping()
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{flightId}")
    public Optional<Flight> getFlightById(@PathVariable("flightId") String flightId) {
        return flightService.getFlightById(flightId);
    }

}

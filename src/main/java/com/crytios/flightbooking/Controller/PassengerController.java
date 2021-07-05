package com.crytios.flightbooking.Controller;

import com.crytios.flightbooking.Models.Passenger;
import com.crytios.flightbooking.Services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("passengers")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping
    public List<Passenger> getAllPassengers(){

        return passengerService.getAllPassengers();
    }
    @GetMapping("/{passengerId}")
    public Optional<Passenger> getPassengerById(@PathVariable("passengerId") String passengerId){
        return passengerService.getPassengerById(passengerId);
    }

}

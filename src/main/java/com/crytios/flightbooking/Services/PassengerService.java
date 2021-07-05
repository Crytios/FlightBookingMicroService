package com.crytios.flightbooking.Services;

import com.crytios.flightbooking.Models.Passenger;

import java.util.List;
import java.util.Optional;

public interface PassengerService {
    Optional<Passenger> getPassengerById(String id);
    List<Passenger> getAllPassengers();

}

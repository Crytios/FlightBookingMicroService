package com.crytios.flightbooking.Services;

import com.crytios.flightbooking.Models.Passenger;
import com.crytios.flightbooking.Repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerServiceImpl implements PassengerService{
    @Autowired
    private PassengerRepository passengerRepository;
    @Override
    public Optional<Passenger> getPassengerById(String id) {
        return passengerRepository.findById(id);
    }

    @Override
    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }
}

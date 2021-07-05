package com.crytios.flightbooking.Repositories;

import com.crytios.flightbooking.Models.Passenger;
import com.crytios.flightbooking.Services.PassengerService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PassengerRepository extends JpaRepository<Passenger,String> {
    Optional<Passenger> findByEmail(String email);
}

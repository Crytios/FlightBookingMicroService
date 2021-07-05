package com.crytios.flightbooking.Services;

import java.util.List;
import java.util.Optional;

import com.crytios.flightbooking.Models.FlightBooking;

public interface BookingService {

    Optional<FlightBooking> getBooking(String bookingId);

    List<FlightBooking> getAllBookingsByPassenger(String passengerId);

    List<FlightBooking> getAllMultiFlightBookingsByPassenger(String passengerId);

    List<FlightBooking> getAllMultiFlightBookings();

    void createBookings();
}
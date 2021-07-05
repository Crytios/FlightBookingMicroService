package com.crytios.flightbooking.Services;

import java.util.List;
import java.util.Optional;

import com.crytios.flightbooking.Models.FlightBooking;
import com.crytios.flightbooking.Models.Passenger;
import com.crytios.flightbooking.Repositories.FlightBookingRepository;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;

public class BookingServiceImpl implements BookingService {

    @Autowired
    private FlightBookingRepository bookingRepo;

    @Override
    public Optional<FlightBooking> getBooking(String bookingId) {
        return bookingRepo.findById(bookingId);
    }

    @Override
    public List<FlightBooking> getAllBookingsByPassenger(String passengerId) {
        List<FlightBooking> bookings = bookingRepo.findByPassengerId(passengerId);
        return bookings;

    }

    @Override

    public void createBookings() {

    }

    @Override
    public List<FlightBooking> getAllMultiFlightBookingsByPassenger(String passengerId) {
        List<FlightBooking> bookings = bookingRepo.findByPassengerId(passengerId);
        return bookings.stream().filter(booking -> booking.getFlights().size() > 1).collect(Collectors.toList());
    }

    @Override
    public List<FlightBooking> getAllMultiFlightBookings() {
        List<FlightBooking> bookings = bookingRepo.findAll();
        return bookings;
    }

}

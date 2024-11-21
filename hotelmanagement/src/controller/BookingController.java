package controller;

import model.*;
import service.BookingService;

import java.util.Date;

public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public Booking createBooking(Guest guest, Hotel hotel, Room room, Date checkIn, Date checkOut) {
        return bookingService.createBooking(guest, hotel, room, checkIn, checkOut);
    }

    public Bill generateBill(Booking booking) {
        return bookingService.generateBill(booking);
    }
}

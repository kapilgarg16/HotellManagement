package service;

import model.*;

import java.util.Date;

public class BookingService {
    public Booking createBooking(Guest guest, Hotel hotel, Room room, Date checkInDate, Date checkOutDate) {
        return new Booking("B" + System.currentTimeMillis(), guest, hotel, room, checkInDate, checkOutDate);
    }

    public Bill generateBill(Booking booking) {
        return new Bill("Bill" + System.currentTimeMillis(), booking);
    }
}

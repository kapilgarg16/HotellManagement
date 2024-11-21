import controller.*;
import model.*;
import service.*;

import java.util.*;

public class HotelManagementApplication {
    public static void main(String[] args) {
        // Initialize data
        Hotel hotel1 = new Hotel("H001", "The Grand Hotel", "New Delhi", 4.5);
        Hotel hotel2 = new Hotel("H002", "Sea View Resort", "Goa", 4.8);

        Room room1 = new Room("R101", "Single", 2000);
        Room room2 = new Room("R102", "Double", 3000);
        hotel1.addRoom(room1);
        hotel1.addRoom(room2);

        Room room3 = new Room("R201", "Single", 2500);
        Room room4 = new Room("R202", "Double", 3500);
        hotel2.addRoom(room3);
        hotel2.addRoom(room4);

        // Services and Controllers
        HotelService hotelService = new HotelService(Arrays.asList(hotel1, hotel2));
        BookingService bookingService = new BookingService();

        HotelController hotelController = new HotelController(hotelService);
        BookingController bookingController = new BookingController(bookingService);

        // Search hotels
        System.out.println("Hotels in New Delhi:");
        List<Hotel> hotels = hotelController.searchHotels("New Delhi");
        hotels.forEach(System.out::println);

        // Create Booking
        Guest guest = new Guest("G001", "Kapil Garg", "9876543210", "kapil@example.com");
        Booking booking = bookingController.createBooking(guest, hotel1, room1, new Date(), new Date());
        System.out.println("\nBooking Created:");
        System.out.println(booking);

        // Generate Bill
        Bill bill = bookingController.generateBill(booking);
        System.out.println("\nGenerated Bill:");
        System.out.println(bill);
    }
}

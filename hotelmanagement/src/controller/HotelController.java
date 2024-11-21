package controller;

import model.Hotel;
import service.HotelService;

import java.util.List;

public class HotelController {
    private HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    public List<Hotel> searchHotels(String location) {
        return hotelService.searchHotelsByLocation(location);
    }

    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }
}

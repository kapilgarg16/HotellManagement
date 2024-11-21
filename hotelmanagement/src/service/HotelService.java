package service;

import model.Hotel;

import java.util.List;
import java.util.stream.Collectors;

public class HotelService {
    private List<Hotel> hotels;

    public HotelService(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Hotel> searchHotelsByLocation(String location) {
        return hotels.stream()
                .filter(hotel -> hotel.getLocation().equalsIgnoreCase(location))
                .collect(Collectors.toList());
    }

    public List<Hotel> getAllHotels() {
        return hotels;
    }
}

package io.github.morbidreich.AnotherAirportApi.services;

import io.github.morbidreich.AnotherAirportApi.entities.Airport;
import io.github.morbidreich.AnotherAirportApi.repos.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    public List<Airport> getAirports() {
        List<Airport> airports = new ArrayList<>();
        airportRepository.findAll().forEach(airports::add);
        return airports;
    }

    public Airport getAirport(String icaoCode) {
        return airportRepository.findById(icaoCode.toUpperCase()).get();
    }

    public void addAirport(Airport airport) {
        airport.setIcaoCode(airport.getIcaoCode().toUpperCase());
        airportRepository.save(airport);
    }

    public void updateAirport(String icaoCode, Airport airport) {
        airport.setIcaoCode(airport.getIcaoCode().toUpperCase());
        airportRepository.save(airport);
    }

    public void deleteAirport(String icaoCode) {
        airportRepository.deleteById(icaoCode.toUpperCase());
    }
}

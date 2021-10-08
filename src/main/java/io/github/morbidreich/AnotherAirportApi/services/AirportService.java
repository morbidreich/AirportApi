package io.github.morbidreich.AnotherAirportApi.services;

import io.github.morbidreich.AnotherAirportApi.entities.Airport;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AirportService {

    List<Airport> airports = new ArrayList(Arrays.asList(
            new Airport("EPWA", "WAW", "Chopin Airport"),
            new Airport("EPKK", "KRK", "Kraków Balice Cośtam"))
    );

    public List<Airport> getAirports() {
        return airports;
    }

    public Airport getAirport(String icaoCode) {
        return airports.stream().filter(
                a -> a.getIcaoCode().equals(icaoCode.toUpperCase()))
                .findFirst().get();
    }

    public void addAirport(Airport airport) {
        airports.add(airport);
    }

    public void updateAirport(String icaoCode, Airport airport) {
        for (int i = 0; i < airports.size(); i++) {
            Airport a = airports.get(i);
            if (a.getIcaoCode().equals(icaoCode.toUpperCase())) {
                airports.set(i, airport);
                return;
            }
        }

    }

    public void deleteAirport(String icaoCode) {
        airports.removeIf(a -> a.getIcaoCode().equals(icaoCode.toUpperCase()));
    }
}

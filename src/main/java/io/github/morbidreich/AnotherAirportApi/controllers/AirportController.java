package io.github.morbidreich.AnotherAirportApi.controllers;

import io.github.morbidreich.AnotherAirportApi.entities.Airport;
import io.github.morbidreich.AnotherAirportApi.services.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping("/airports")
    public List<Airport> getAirports() {
        return airportService.getAirports();
    }

    @RequestMapping("/airports/{icaoCode}")
    public Airport getAirport(@PathVariable String icaoCode) {
        // @PathVariable enables to utilize {x} part of url mapping as variable
        // and pass it as method argument
        return airportService.getAirport(icaoCode);
    }

    @PostMapping("/airports")
    public void addAirport(@RequestBody Airport airport) {
        // @RequestBody tells Spring, that post request made to /airports endpoint
        // will have json representation of Airport object
        airportService.addAirport(airport);
    }

    @PutMapping("/airports/{icaoCode}")
    public void updateAirport(@RequestBody Airport airport, @PathVariable String icaoCode) {

        // method updateAirport with update airport with code icaoCode
        // with values passed in json as airport variable
        airportService.updateAirport(icaoCode, airport);
    }

    @DeleteMapping("/airports/{icaoCode}")
    public void deleteAirport(@PathVariable String icaoCode) {
        airportService.deleteAirport(icaoCode);
    }
}

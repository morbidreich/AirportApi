package io.github.morbidreich.AnotherAirportApi;

import io.github.morbidreich.AnotherAirportApi.entities.Airport;
import io.github.morbidreich.AnotherAirportApi.services.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class hello {

    @RequestMapping("/hello")
    public String hello() {
        return "hello there";
    }
}

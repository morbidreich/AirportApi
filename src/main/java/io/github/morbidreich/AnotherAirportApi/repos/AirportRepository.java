package io.github.morbidreich.AnotherAirportApi.repos;

import io.github.morbidreich.AnotherAirportApi.entities.Airport;
import org.springframework.data.repository.CrudRepository;

public interface AirportRepository extends CrudRepository<Airport, String> {


}

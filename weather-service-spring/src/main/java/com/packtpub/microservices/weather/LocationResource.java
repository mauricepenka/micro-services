package com.packtpub.microservices.weather;


import com.packtpub.microservices.weather.domain.Location;
import com.packtpub.microservices.weather.domain.Temperature;
import com.packtpub.microservices.weather.utils.Utils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/locations")
public class LocationResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Location>> getAverageTemperature() {
        List<Location> listeLocation = new ArrayList<>();
        Temperature temperature;
        Location location;

        location = new Location();
        location.setId((long) Utils.getInteger(0, 1000));
        location.setName("Paris");
        temperature = new Temperature();
        temperature.setId((long)Utils.getInteger(0,1000));
        temperature.setTemperature(Utils.getInteger(10,30));
        temperature.setTemperatureScale(Utils.randomScale());
        location.setTemperature(temperature);
        listeLocation.add(location);

        location = new Location();
        location.setId((long) Utils.getInteger(0, 1000));
        location.setName("Lyon");
        temperature = new Temperature();
        temperature.setId((long)Utils.getInteger(0,1000));
        temperature.setTemperature(Utils.getInteger(10,30));
        temperature.setTemperatureScale(Utils.randomScale());
        location.setTemperature(temperature);
        listeLocation.add(location);

        location = new Location();
        location.setId((long) Utils.getInteger(0, 1000));
        location.setName("Nancy");
        temperature = new Temperature();
        temperature.setId((long)Utils.getInteger(0,1000));
        temperature.setTemperature(Utils.getInteger(10,30));
        temperature.setTemperatureScale(Utils.randomScale());
        location.setTemperature(temperature);
        listeLocation.add(location);

        return ResponseEntity.ok(listeLocation);
    }
}

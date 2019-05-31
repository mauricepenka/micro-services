package com.packtpub.microservices.weather;

import com.packtpub.microservices.weather.domain.Humidity;
import com.packtpub.microservices.weather.utils.Utils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HumidityResource {

    @GetMapping("/humidity/{city}")
    public ResponseEntity<Humidity> getAverageHumidity(@PathVariable(value = "city") String city) {
        Humidity humidity = new Humidity();
        humidity.setId((long) Utils.getInteger(0, 1000));
        humidity.setPercentage(Utils.getInteger(10, 30));
        humidity.setHumidityType(Utils.randomPercentageHumidity());
        return ResponseEntity.ok(humidity);
    }
}
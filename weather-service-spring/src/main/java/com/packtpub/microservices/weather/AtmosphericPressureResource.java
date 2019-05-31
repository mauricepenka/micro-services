package com.packtpub.microservices.weather;


import com.packtpub.microservices.weather.domain.AtmosphericPressure;
import com.packtpub.microservices.weather.utils.Utils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AtmosphericPressureResource {

    @GetMapping("/pressure/{city}")
    public ResponseEntity<AtmosphericPressure> getAverageTemperature(@PathVariable("city") String city) {
        AtmosphericPressure atmosphericPressure;

        atmosphericPressure = new AtmosphericPressure();
        atmosphericPressure.setId((long) Utils.getInteger(0, 1000));
        atmosphericPressure.setValue(Utils.getInteger(10, 30));
        atmosphericPressure.setPressureScale(Utils.randomScalePressure());

        return ResponseEntity.ok(atmosphericPressure);
    }
}

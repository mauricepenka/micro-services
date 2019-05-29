package com.packtpub.microservices.weather;


import com.packtpub.microservices.weather.domain.AtmosphericPressure;
import com.packtpub.microservices.weather.utils.Utils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/locations")
public class AtmosphericPressureResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<AtmosphericPressure>> getAverageTemperature() {
        List<AtmosphericPressure> listePressure = new ArrayList<>();
        List<AtmosphericPressure> listeHumidity = new ArrayList<>();
        AtmosphericPressure atmosphericPressure;
        for(int i = 0 ; i < 10 ; i++){
            atmosphericPressure = new AtmosphericPressure();
            atmosphericPressure.setId((long)Utils.getInteger(0,1000));
            atmosphericPressure.setValue(Utils.getInteger(10,30));
            atmosphericPressure.setPressureScale(Utils.randomScalePressure());
            listeHumidity.add(atmosphericPressure);
        }

        return ResponseEntity.ok(listePressure);
    }
}

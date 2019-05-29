package com.packtpub.microservices.weather;

import com.packtpub.microservices.weather.domain.TemperatureScale;
import com.packtpub.microservices.weather.utils.Utils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.packtpub.microservices.weather.domain.Temperature;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/temperatures")
public class TemperatureResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Temperature>> getAverageTemperature() {
        List<Temperature> listeTemperature = new ArrayList<>();
		Temperature temperature;
        for(int i = 0 ; i < 10 ; i++){
			temperature = new Temperature();
			temperature.setId((long)Utils.getInteger(0,1000));
			temperature.setTemperature(Utils.getInteger(10,30));
			temperature.setTemperatureScale(Utils.randomScale());
			listeTemperature.add(temperature);
		}
		return ResponseEntity.ok(listeTemperature);
	}
}
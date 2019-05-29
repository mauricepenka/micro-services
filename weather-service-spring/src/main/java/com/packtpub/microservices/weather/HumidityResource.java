package com.packtpub.microservices.weather;

import com.packtpub.microservices.weather.domain.Humidity;
import com.packtpub.microservices.weather.utils.Utils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/humidity")
public class HumidityResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Humidity>> getAverageHumidity() {
        List<Humidity> listeHumidity = new ArrayList<>();
		Humidity humidity;
        for(int i = 0 ; i < 10 ; i++){
			humidity = new Humidity();
			humidity.setId((long)Utils.getInteger(0,1000));
			humidity.setPercentage(Utils.getInteger(10,30));
			humidity.setHumidityType(Utils.randomPercentageHumidity());
			listeHumidity.add(humidity);
		}
		return ResponseEntity.ok(listeHumidity);
	}
}
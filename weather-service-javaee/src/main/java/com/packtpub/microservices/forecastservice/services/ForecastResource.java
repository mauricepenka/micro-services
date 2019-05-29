package com.packtpub.microservices.forecastservice.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.packtpub.microservices.forecastservice.domain.Forecast;
import com.packtpub.microservices.forecastservice.domain.Location;
import com.packtpub.microservices.forecastservice.domain.ServiceResponse;
import com.packtpub.microservices.forecastservice.domain.Temperature;
import com.packtpub.microservices.forecastservice.producer.WebTargetProducer;

@Path("/forecast")
public class ForecastResource {
//	@Uri("location")
//	private WebTarget locationTarget;
//	@Uri("temperature/{city}")
//	private WebTarget temperatureTarget;
	@Inject
	WebTargetProducer targetProducer;	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLocationsWithTemperature() {

		WebTarget locationTarget = targetProducer.produceLocationWebTarget();
		WebTarget temperatureTarget = targetProducer.producetemperatureWebTarget();

		long startTime = System.currentTimeMillis();
		ServiceResponse response = new ServiceResponse();
		List<Location> locations = locationTarget.request().get(new GenericType<List<Location>>() {
		});
		locations.forEach(location -> {
			Temperature temperature = temperatureTarget.resolveTemplate("city", location.getName()).request()
					.get(Temperature.class);
			response.getForecasts().add(new Forecast(location, temperature));
		});
		long endTime = System.currentTimeMillis();
		response.setProcessingTime(endTime - startTime);
		return Response.ok(response).build();
	}
}

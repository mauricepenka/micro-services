package com.packtpub.microservices.forecastservice.services;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.packtpub.microservices.forecastservice.domain.Humidity;
import com.packtpub.microservices.forecastservice.producer.WebTargetProducer;

@Path("/humidity")
public class HumidityResource {
	
	@Inject
	WebTargetProducer targetProducer;

	@GET
	@Path("/{city}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAverageHumidity(@PathParam("city") String cityName) {
		
		WebTarget humidityTarget = targetProducer.produceHumidityWebTarget();
        Humidity humidity = humidityTarget.resolveTemplate("city", cityName).request()
				.get(Humidity.class);
        System.out.println(humidity.toString());
        return Response.ok(humidity).build();
    }
}
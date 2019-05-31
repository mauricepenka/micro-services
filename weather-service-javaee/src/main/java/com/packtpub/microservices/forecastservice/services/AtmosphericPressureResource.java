package com.packtpub.microservices.forecastservice.services;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.packtpub.microservices.forecastservice.domain.AtmosphericPressure;
import com.packtpub.microservices.forecastservice.producer.WebTargetProducer;

@Path("/pressure")
public class AtmosphericPressureResource {

	@Inject
	WebTargetProducer targetProducer;

	@GET
	@Path("/{city}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAverageTemperature(@PathParam("city") String cityName) {

		WebTarget atmosphericPressureTarget = targetProducer.produceAtmosphericPressureWebTarget();
		AtmosphericPressure atmosphericPressure = atmosphericPressureTarget.resolveTemplate("city", cityName).request()
				.get(AtmosphericPressure.class);
		
		System.out.println(atmosphericPressure.toString());

		return Response.ok(atmosphericPressure).build();
	}
}
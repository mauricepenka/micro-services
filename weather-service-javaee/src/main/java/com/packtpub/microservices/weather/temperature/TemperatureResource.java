package com.packtpub.microservices.weather.temperature;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.core.Response;

/**
 * RESTful resource providing information about city's temperature
 */

@Path("/temperature")
public class TemperatureResource {

	/**
	 * Provides average temperature from all the city's sensors. The temperature is
	 * artificial.
	 *
	 * @return {@link Response} with constant temperature
	 */

	@GET
	public Response getAverageTemperature() {
		return Response.ok("35  Degrees").build();
	}
}

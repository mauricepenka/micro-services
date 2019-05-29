package com.packtpub.microservices.forecastservice.producer;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

@ApplicationScoped
public class WebTargetProducer {
	private Client client;

	@PostConstruct
	private void postConstruct() {
		this.client = ClientBuilder.newClient();
	}

	@Produces
	@Dependent
	public WebTarget produceLocationWebTarget() {
		return client.target("http://localhost:8080").path("forecast-service").path("smartcity").path("location");
	}

	@Produces
	@Dependent
	public WebTarget producetemperatureWebTarget() {
		return client.target("http://localhost:8080").path("forecast-service").path("smartcity").path("temperature")
				.path("/{city}");
	}
}
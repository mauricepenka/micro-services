package com.packtpub.microservices.forecastservice.domain;

public class Forecast {

	private Location location;
	private Temperature temperature;

	public Forecast(Location location, Temperature temperature) {
		this.temperature = temperature;
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Temperature getTemperature() {
		return temperature;
	}

	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

}

package com.packtpub.microservices.forecastservice.domain;

public class Forecast {

	private Location location;
	private Temperature temperature;
	private Humidity humidity;
	private AtmosphericPressure atmosphericPressure;

	public Forecast(Location location, Temperature temperature, Humidity humidity,
			AtmosphericPressure atmosphericPressure) {
		super();
		this.location = location;
		this.temperature = temperature;
		this.humidity = humidity;
		this.atmosphericPressure = atmosphericPressure;
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

	public Humidity getHumidity() {
		return humidity;
	}

	public void setHumidity(Humidity humidity) {
		this.humidity = humidity;
	}

	public AtmosphericPressure getAtmosphericPressure() {
		return atmosphericPressure;
	}

	public void setAtmosphericPressure(AtmosphericPressure atmosphericPressure) {
		this.atmosphericPressure = atmosphericPressure;
	}

}

package com.packtpub.microservices.forecastservice.domain;

public class Humidity {
	private long Id;
	private double percentage;
	private String humidityType;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getHumidityType() {
		return humidityType;
	}

	public void setHumidityType(String humidityType) {
		this.humidityType = humidityType;
	}

	@Override
	public String toString() {
		return "Humidity [Id=" + Id + ", percentage=" + percentage + ", humidityType=" + humidityType + "]";
	}
	
}

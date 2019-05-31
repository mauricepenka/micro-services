package com.packtpub.microservices.forecastservice.domain;

public class AtmosphericPressure {
	private long id;
	private double value;
	private String PressureScale;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getPressureScale() {
		return PressureScale;
	}

	public void setPressureScale(String pressureScale) {
		PressureScale = pressureScale;
	}

	@Override
	public String toString() {
		return "AtmosphericPressure [id=" + id + ", value=" + value + ", PressureScale=" + PressureScale + "]";
	}
	
}

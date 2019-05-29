package com.packtpub.microservices.forecastservice.domain;

import java.util.ArrayList;
import java.util.List;

public class ServiceResponse {

	private long processingTime;
	private List<Forecast> forecasts = new ArrayList<Forecast>();

	public ServiceResponse() {

	}

	public long getProcessingTime() {
		return processingTime;
	}

	public void setProcessingTime(long processingTime) {
		this.processingTime = processingTime;
	}

	public List<Forecast> getForecasts() {
		return forecasts;
	}

	public void setForecasts(List<Forecast> forecasts) {
		this.forecasts = forecasts;
	}

}

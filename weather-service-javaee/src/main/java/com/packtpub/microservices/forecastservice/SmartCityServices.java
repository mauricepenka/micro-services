package com.packtpub.microservices.forecastservice;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.packtpub.microservices.forecastservice.services.AtmosphericPressureResource;
import com.packtpub.microservices.forecastservice.services.ForecastResource;
import com.packtpub.microservices.forecastservice.services.HumidityResource;
import com.packtpub.microservices.forecastservice.services.LocationResource;
import com.packtpub.microservices.forecastservice.services.TemperatureResource;

@ApplicationPath("/smartcity")
public class SmartCityServices extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(LocationResource.class);
		classes.add(TemperatureResource.class);
		classes.add(ForecastResource.class);
		//classes.add(AtmosphericPressureResource.class);
		//classes.add(HumidityResource.class);
		return classes;
	}
}

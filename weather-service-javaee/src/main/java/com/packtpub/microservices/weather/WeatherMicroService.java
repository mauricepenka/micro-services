package com.packtpub.microservices.weather;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configuration of Weather Service's REST API's context path.
 */

@ApplicationPath("/weather")
public class WeatherMicroService extends Application {
}
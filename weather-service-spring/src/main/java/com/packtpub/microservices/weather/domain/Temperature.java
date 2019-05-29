package com.packtpub.microservices.weather.domain;

import java.util.Random;

public class Temperature {
    private Long id;
    private Integer temperature;
    private TemperatureScale temperatureScale;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public TemperatureScale getTemperatureScale() {
        return temperatureScale;
    }

    public void setTemperatureScale(TemperatureScale temperatureScale) {
        this.temperatureScale = temperatureScale;
    }
}

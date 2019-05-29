package com.packtpub.microservices.weather.domain;

import com.packtpub.microservices.weather.enumm.HumidityType;

public class Humidity {
    private long Id;
    private double percentage;
    private HumidityType humidityType;

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

    public HumidityType getHumidityType() {
        return humidityType;
    }

    public void setHumidityType(HumidityType humidityType) {
        this.humidityType = humidityType;
    }
}

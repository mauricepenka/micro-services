package com.packtpub.microservices.weather.domain;

import java.util.Random;

public enum TemperatureScale {
    CELSIUS(0), FAHRENHEIT(1), KELVIN(2);

    private int scale;

    TemperatureScale(int scale) {
        this.scale = scale;
    }

    int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }
}

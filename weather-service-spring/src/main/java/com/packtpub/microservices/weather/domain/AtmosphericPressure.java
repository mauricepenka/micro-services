package com.packtpub.microservices.weather.domain;

import com.packtpub.microservices.weather.enumm.PressureScale;

public class AtmosphericPressure {
    private long id;
    private double value;
    private PressureScale PressureScale;

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

    public PressureScale getPressureScale() {
        return PressureScale;
    }

    public void setPressureScale(PressureScale pressureScale) {
        PressureScale = pressureScale;
    }
}

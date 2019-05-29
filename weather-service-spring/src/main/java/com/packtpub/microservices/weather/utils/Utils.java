package com.packtpub.microservices.weather.utils;

import com.packtpub.microservices.weather.domain.TemperatureScale;

import java.util.Random;

public class Utils {

    public static int getInteger(int min, int max){
        Random random = new Random();
        return random.ints(min,(max+1)).findFirst().getAsInt();
    }

    public static TemperatureScale randomScale() {
        int pick = new Random().nextInt(TemperatureScale.values().length);
        return TemperatureScale.values()[pick];
    }
}

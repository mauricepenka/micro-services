package com.packtpub.microservices.weather.utils;

import com.packtpub.microservices.weather.enumm.HumidityType;
import com.packtpub.microservices.weather.enumm.PressureScale;

import java.util.Random;

public class Utils {

    public static int getInteger(int min, int max){
        Random random = new Random();
        return random.ints(min,(max+1)).findFirst().getAsInt();
    }

    public static HumidityType randomPercentageHumidity() {
        int pick = new Random().nextInt(HumidityType.values().length);
        return HumidityType.values()[pick];
    }

    public static PressureScale randomScalePressure() {
        int pick = new Random().nextInt(PressureScale.values().length);
        return PressureScale.values()[pick];
    }
}

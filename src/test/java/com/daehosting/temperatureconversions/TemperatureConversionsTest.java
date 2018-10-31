package com.daehosting.temperatureconversions;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResults = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals(celsiusToFahrenheitResults,
                BigDecimal.valueOf(32),
                "The Celcius to Fahrenheit conversion failed");

        BigDecimal fahrenheitToCelsiusResults = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals(fahrenheitToCelsiusResults,
                BigDecimal.valueOf(0),
                "The Fahrenheit to Celcius conversion failed");

        BigDecimal windChillInCelsius = service.windChillInCelsius(BigDecimal.valueOf(1.5),BigDecimal.valueOf(15));
        assertEquals(windChillInCelsius,
                BigDecimal.valueOf(-11.34375),
                "The Wind Chill In Celsius failed");

        BigDecimal windChillInFahrenheit = service.windChillInFahrenheit(BigDecimal.valueOf(46), BigDecimal.valueOf(9));
        assertEquals(windChillInFahrenheit,
                BigDecimal.valueOf(33.57251987),
                "The Wind Chill In Fahrenheit failed");


    }




}
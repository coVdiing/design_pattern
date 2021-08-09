package com.vi.design.pattern.observer;

/**
 * @Author: vi
 * @Date: 2021-08-09 22:32
 * @Version: 1.0
 * @Description:
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(35f,65f,30.4f);
        weatherData.setMeasurements(36f,65f,30.4f);
        weatherData.setMeasurements(31f,65f,30.4f);
    }
}

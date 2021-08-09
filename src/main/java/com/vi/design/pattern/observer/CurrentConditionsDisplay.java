package com.vi.design.pattern.observer;

/**
 * @Author: vi
 * @Date: 2021-08-09 22:25
 * @Version: 1.0
 * @Description:当前状况显示板
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("当前温度:" + this.temperature + "\n当前湿度:" + this.humidity);
    }

    /**
     * 当update被调用时把温度和湿度保存起来并展示
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}

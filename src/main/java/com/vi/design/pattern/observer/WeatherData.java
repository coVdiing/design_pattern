package com.vi.design.pattern.observer;

import java.util.ArrayList;

/**
 * @Author: vi
 * @Date: 2021-08-09 22:12
 * @Version: 1.0
 * @Description:气象站数据
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    /**
     * 将观察者加入集合
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    /**
     * 当观察者想要取消注册
     * @param observer
     */
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0) {
            observers.remove(i);
        }
    }

    /**
     * 逐一通知观察者
     */
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当气象站更新观测值，通知观察者
     */
    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

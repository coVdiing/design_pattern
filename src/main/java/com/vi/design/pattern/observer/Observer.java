package com.vi.design.pattern.observer;

/**
 * 观察者接口
 * @author vi
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}

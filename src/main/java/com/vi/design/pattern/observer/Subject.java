package com.vi.design.pattern.observer;


/**
 * 主题接口
 * @author vi
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}

package com.vi.design.principle.interfacesegregation;

/**
 * @Author: vi
 * @Date: 2021-06-26 10:18
 * @Version: 1.0
 * @Description:
 */
//v1
//public class Bird implements IAnimalAction{
//    @Override
//    public void eat() {
//
//    }
//
//    @Override
//    public void fly() {
//
//    }
//
//    @Override
//    public void swim() {
//
//    }
//}

public class Bird implements IFlyAnimalAction,IEatAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

}

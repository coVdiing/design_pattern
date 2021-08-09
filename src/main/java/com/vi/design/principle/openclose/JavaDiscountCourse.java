package com.vi.design.principle.openclose;

/**
 * @Author: vi
 * @Date: 2021-06-26 8:21
 * @Version: 1.0
 * @Description:
 */
public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getPrice() {
        return super.getPrice()*0.8;
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }
}

package com.vi.design.principle.openclose;

/**
 * @Author: vi
 * @Date: 2021-06-26 8:12
 * @Version: 1.0
 * @Description:
 */
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

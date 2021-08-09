package com.vi.design.principle.openclose;

/**
 * @Author: vi
 * @Date: 2021-06-26 8:13
 * @Version: 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1,"Java设计模式",299d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID:" + javaCourse.getId() + ",课程名称:" + javaCourse.getName() + ",价格:" + javaCourse.getPrice()+",原价:"+javaCourse.getOriginPrice());
    }
}

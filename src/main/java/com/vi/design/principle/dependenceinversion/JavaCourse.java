package com.vi.design.principle.dependenceinversion;

/**
 * @Author: vi
 * @Date: 2021-06-26 9:19
 * @Version: 1.0
 * @Description:
 */
public class JavaCourse implements ICourse{
    @Override
    public void studyImoocCourse() {
        System.out.println("学习Java课程");
    }
}

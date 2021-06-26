package com.vi.design.principle.dependenceinversion;

/**
 * @Author: vi
 * @Date: 2021-06-26 9:17
 * @Version: 1.0
 * @Description:
 */
public class FECourse implements ICourse{
    @Override
    public void studyImoocCourse() {
        System.out.println("学习前端课程");
    }
}

package com.vi.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: vi
 * @Date: 2021-06-26 10:33
 * @Version: 1.0
 * @Description:
 */
public class TeamLeader {
    public void checkNumberOfCourses() {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("在线课程的数量:"+courses.size());
    }
}

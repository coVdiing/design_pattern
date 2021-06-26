package com.vi.design.principle.demeter;

/**
 * @Author: vi
 * @Date: 2021-06-26 10:33
 * @Version: 1.0
 * @Description:
 */
public class Boss {
//    v1
//    public void commandCheckNumber(TeamLeader teamLeader) {
//        List<Course> courses = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            courses.add(new Course());
//        }
//        teamLeader.checkNumberOfCourses(courses);
//    }

//    v2
    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }
}

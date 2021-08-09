package com.vi.design.principle.dependenceinversion;

/**
 * @Author: vi
 * @Date: 2021-06-26 9:07
 * @Version: 1.0
 * @Description:
 */
public class Geely {
//    v1
//    public void studyJavaCourse() {
//        System.out.println("Geely学习Java课程");
//    }
//    public void studyFECourse() {
//        System.out.println("Geely学习前端课程");
//    }

//     v2
//    public void studyImoocCourse(ICourse iCourse) {
//        iCourse.studyImoocCourse();
//    }

//    v3
//    ICourse course;
//
//    public Geely(ICourse course) {
//        this.course = course;
//    }
//
//    public void studyImoocCourse() {
//        course.studyImoocCourse();
//    }

    ICourse course;

    public Geely(ICourse course) {
        this.course = course;
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void studyImoocCourse() {
        course.studyImoocCourse();
    }

}

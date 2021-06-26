package com.vi.design.principle.dependenceinversion;

/**
 * @Author: vi
 * @Date: 2021-06-26 9:08
 * @Version: 1.0
 * @Description:
 */
public class Test {
//        v1
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyJava();
//        geely.studyFECourse();
//    }

//        v2
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyImoocCourse(new FECourse());
//        geely.studyImoocCourse(new JavaCourse());
//}

//        v3
//    public static void main(String[] args) {
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyImoocCourse();
//    }

//    v4
    public static void main(String[] args) {
        Geely geely = new Geely(new JavaCourse());
        geely.studyImoocCourse();
        geely.setCourse(new FECourse());
        geely.studyImoocCourse();
    }
}

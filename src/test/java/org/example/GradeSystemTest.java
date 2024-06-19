package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeSystemTest {

    @Test
    void test1(){
        var grade = new GradeSystem();
        assertEquals('F',grade.determineGrade(59));
    }
    @Test
    void test2(){
        var grade = new GradeSystem();
        assertEquals('D',grade.determineGrade(69));
    }
    @Test
    void test3(){
        var grade = new GradeSystem();
        assertEquals('C',grade.determineGrade(79));
    }
    @Test
    void test4(){
        var grade = new GradeSystem();
        assertEquals('B',grade.determineGrade(89));
    }
    @Test
    void test5(){
        var grade = new GradeSystem();
        assertEquals('A',grade.determineGrade(99));
    }
    @Test
    void test6(){
        var grade = new GradeSystem();
        assertEquals('F',grade.determineGrade(0));
    }
    @Test
    void test7(){
        var grade = new GradeSystem();
        assertEquals('C',grade.determineGrade(70));
    }
    @Test
    void test8(){
        var grade = new GradeSystem();
        assertEquals('B',grade.determineGrade(80));
    }
    @Test
    void test9(){
        var grade = new GradeSystem();
        assertEquals('A',grade.determineGrade(90));
    }
    @Test
    void negativeScenario(){
        var grade =new GradeSystem();
        assertThrows(IllegalArgumentException.class,
                () -> {
                        grade.determineGrade(-1);
                });
    }
}
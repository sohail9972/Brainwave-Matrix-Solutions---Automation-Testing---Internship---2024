package org.example;

public class GradeSystem {
    public char determineGrade(int numberGradePoint){
        if (numberGradePoint <0){
            throw new IllegalArgumentException("Number grade point is less than the Zero");
        } if (numberGradePoint<60) {
            return 'F';
        } if (numberGradePoint<70) {
            return 'D';
        } if (numberGradePoint<80) {
            return 'C';
        } if (numberGradePoint<90) {
            return 'B';
        }else {
            return 'A';
        }
    }
}

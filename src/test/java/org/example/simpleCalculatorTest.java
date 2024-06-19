package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class simpleCalculatorTest {

    @Test
    void sum() {
//        simpleCalculator sum = new simpleCalculator();
        // in Java The classes can be identified by there class names too

        // with the class object twoo we can access the Elements of the clases

        var cal = new simpleCalculator();
        assertEquals(4, cal.summing(2, 2));
    }
    @Test
    void sum2(){
        var cal = new simpleCalculator();
        assertEquals(8, cal.summing(4,4));
    }
}

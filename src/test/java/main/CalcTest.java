package main;

import static org.junit.Assert.*;

public class CalcTest {

    @org.junit.Test
    public void sumValid() {
        Calc calc = new Calc();
        int sum = calc.sum(3, 2);
        assertEquals(5, sum);
    }
}
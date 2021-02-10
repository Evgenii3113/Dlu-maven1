package main;

import static org.junit.Assert.*;

public class CalcTest {

    @org.junit.Test
    public void sumValid() {
        Calc calc = new Calc();
        int sum = calc.sum(7, 4);
        assertEquals(11, sum);
    }

    @org.junit.Test
    public void subValid() {
        Calc calc = new Calc();
        int sub = calc.sub(7, 4);
        assertEquals(3, sub);
    }

    @org.junit.Test
    public void multValid() {
        Calc calc = new Calc();
        int mult = calc.mult(7, 4);
        assertEquals(28, mult);
    }

    @org.junit.Test
    public void divValid() {
        Calc calc = new Calc();
        int div = calc.div(12, 4);
        assertEquals(3, div);
    }

    @org.junit.Test
    public void divInValid() {
        Calc calc = new Calc();
        int div = calc.div(12, 0);
        assertEquals(-1, div);
    }





}
package main;

public class Calc {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {

        if (b != 0) {
            return a / b;
        } else return -1;
    }
}

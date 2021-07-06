package com.tts.Assignments;
import java.lang.Math;

public class Calculator {
    static int add(int num1, int num2) {
        return num1 + num2;
    }
    static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    static int divide(int num1, int num2) {
        return num1 / num2;
    }
    static int subtract(int num) {
        return num * num;
    }
}

class MagicCalculator extends Calculator {
    private double squareroot(int num) {
        return Math.sqrt(num);
    }
    private double sin(int num) {
        return Math.sin(num);
    }
    private double cosine(int num) {
        return Math.cos(num);
    }
    private double tan(int num) {
        return Math.tan(num);
    }
    private double factorial(int num) {
        return (num == 1 || num == 0) ? 1 : num * factorial(num - 1);
    }

}

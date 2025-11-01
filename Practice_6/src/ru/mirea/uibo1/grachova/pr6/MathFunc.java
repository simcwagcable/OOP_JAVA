package ru.mirea.uibo1.grachova.pr6;

public class MathFunc implements MathCalculable {

    @Override
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }
}
package ru.mirea.uibo1.grachova.pr6;

public class MathFuncTest {
    public static void main(String[] args) {
        MathCalculable mf = new MathFunc();

        System.out.println("2 в степени 3: " + mf.power(2, 3)); // 8.0

        System.out.println("Модуль |3 + 4i|: " + mf.complexModulus(3, 4)); // 5.0

        MathFunc func = (MathFunc) mf;
        System.out.println("Длина окружности с R=5: " + func.calculateCircumference(5)); // ~31.415
    }
}
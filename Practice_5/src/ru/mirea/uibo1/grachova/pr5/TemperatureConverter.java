package ru.mirea.uibo1.grachova.pr5;

public class TemperatureConverter implements Convertable {

    private double kelvin;
    private double fahrenheit;

    @Override
    public void convert(double celsius) {
        this.kelvin = celsius + 273.15;

        this.fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        System.out.printf("%.2f °C равно:\n", celsius);
        System.out.printf("  Кельвин: %.2f K\n", this.kelvin);
        System.out.printf("  Фаренгейт: %.2f °F\n", this.fahrenheit);
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        converter.convert(100.0);

        converter.convert(0.0);
    }
}
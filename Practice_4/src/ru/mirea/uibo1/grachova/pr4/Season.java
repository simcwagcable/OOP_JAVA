package ru.mirea.uibo1.grachova.pr4;

public enum Season {
    // Константы перечисления с вызовом конструктора
    WINTER(0) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(10) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SUMMER(25) { // 3) Средняя температура
        @Override
        public String getDescription() { // 5) Переопределение getDescription для Лето
            return "Теплое время года";
        }
    },
    AUTUMN(8) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    // 3) Переменная для средней температуры
    private final int averageTemperature;

    // 4) Конструктор, принимающий среднюю температуру
    private Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    // Геттер для температуры
    public int getAverageTemperature() {
        return averageTemperature;
    }

    // 5) Метод getDescription (абстрактный, чтобы заставить переопределить)
    public abstract String getDescription();


    // Метод для пункта 2: использование switch
    public static void iLoveSeason(Season season) {
        // Используем оператор switch [cite: 31, 35]
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("Я люблю все времена года!");
        }
    }

    public static void main(String[] args) {
        // 1) Создать переменную и распечатать информацию
        Season myFavorite = Season.SUMMER;

        System.out.println("Мое любимое время года: " + myFavorite.toString()); // toString() выводит имя константы [cite: 60, 69]
        System.out.println("Средняя температура: " + myFavorite.getAverageTemperature() + "°C");
        System.out.println("Описание: " + myFavorite.getDescription());

        System.out.println("\nМетод iLoveSeason");
        iLoveSeason(myFavorite);
        iLoveSeason(Season.WINTER);

        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("  Температура: " + season.getAverageTemperature() + "°C");
            System.out.println("  Описание: " + season.getDescription());
        }
    }
}
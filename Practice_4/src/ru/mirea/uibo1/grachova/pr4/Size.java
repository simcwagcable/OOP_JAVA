package ru.mirea.uibo1.grachova.pr4;

public enum Size {
    // Константы перечисления с euroSize
    XXS(32) {
        @Override
        public String getDescription() { // Переопределение getDescription для XXS
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    // Конструктор
    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    // Геттер
    public int getEuroSize() {
        return euroSize;
    }

    // Метод getDescription по умолчанию
    public String getDescription() {
        return "Взрослый размер";
    }

    public static void main(String[] args) {
        System.out.println("Размер XXS: " + Size.XXS.getDescription() + ", Euro: " + Size.XXS.getEuroSize());
        System.out.println("Размер M: " + Size.M.getDescription() + ", Euro: " + Size.M.getEuroSize());
    }
}
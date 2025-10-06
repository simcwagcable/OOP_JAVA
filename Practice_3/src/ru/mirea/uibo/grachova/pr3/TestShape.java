package ru.mirea.uibo.grachova.pr3;

public class TestShape {
    public static void main(String[] args) {

        // 1. Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape [cite: 94]
        Shape s1 = new Circle(5.5, "RED", false);
        // Объяснение: s1 имеет статический тип Shape, но динамический тип Circle.
        // Это пример восходящего преобразования (Upcasting).

        // 2. System.out.println(s1); [cite: 95]
        System.out.println(s1);
        // Вывод: Будет вызван переопределенный метод toString() из класса Circle. Это Позднее связывание/Полиморфизм.

        // 3. System.out.println(s1.getArea()); [cite: 96]
        System.out.println("Area: " + s1.getArea());
        // Вывод: Будет вызван переопределенный метод getArea() из класса Circle. Это Полиморфизм.

        // 4. System.out.println(s1.getPerimeter()); [cite: 97]
        System.out.println("Perimeter: " + s1.getPerimeter());
        // Вывод: Будет вызван переопределенный метод getPerimeter() из класса Circle. Это Полиморфизм.

        // 5. System.out.println(s1.getColor()); [cite: 98]
        System.out.println("Color: " + s1.getColor());
        // Вывод: Метод getColor() определен в Shape, вызывается он.

        // 6. System.out.println(s1.isFilled()); [cite: 99]
        System.out.println("Filled: " + s1.isFilled());
        // Вывод: Метод isFilled() определен в Shape, вызывается он.

        // 7. System.out.println(s1.getRadius());
        // System.out.println(s1.getRadius()); // ОШИБКА КОМПИЛЯЦИИ
        // Объяснение: Ошибка компиляции. У статического типа Shape нет метода getRadius().
        // Этот метод есть только в классе Circle.

        // 8. Circle c1 = (Circle) s1; // Downcast back to Circle [cite: 102, 118]
        Circle c1 = (Circle) s1;
        // Объяснение: Нисходящее преобразование (Downcasting) s1 обратно в Circle. Теперь c1 имеет доступ ко всем методам Circle.

        // 9-14. Проверка c1
        System.out.println("\n--- c1 (Downcasted Circle) ---");
        System.out.println(c1); // [cite: 104]
        System.out.println("Area: " + c1.getArea()); // [cite: 107]
        System.out.println("Perimeter: " + c1.getPerimeter()); // [cite: 108]
        System.out.println("Color: " + c1.getColor()); // [cite: 109]
        System.out.println("Filled: " + c1.isFilled()); // [cite: 110]
        System.out.println("Radius: " + c1.getRadius()); // [cite: 111]
        // Вывод: Теперь getRadius() работает, так как c1 имеет статический тип Circle.

        // 16. Shape s2 = new Shape();
        // Shape s2 = new Shape(); // ОШИБКА КОМПИЛЯЦИИ
        // Объяснение: Ошибка компиляции. Абстрактный класс (Shape) не может быть инстанцирован, то есть нельзя создать его объект.

        // 18. Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast [cite: 119]
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println("\n--- s3 (Upcasted Rectangle) ---");

        // 19-23. Проверка s3
        System.out.println(s3); // [cite: 120] -> Rectangle.toString()
        System.out.println("Area: " + s3.getArea()); // [cite: 121] -> Rectangle.getArea()
        System.out.println("Perimeter: " + s3.getPerimeter()); // [cite: 122] -> Rectangle.getPerimeter()
        System.out.println("Color: " + s3.getColor()); // [cite: 123]

        // System.out.println(s3.getLength()); // ОШИБКА КОМПИЛЯЦИИ
        // Объяснение: Ошибка компиляции. У статического типа Shape нет метода getLength().

        // 24. Rectangle r1 = (Rectangle) s3; // downcast [cite: 125, 128]
        Rectangle r1 = (Rectangle) s3;
        System.out.println("\n--- r1 (Downcasted Rectangle) ---");

        // 25-28. Проверка r1
        System.out.println(r1); // [cite: 126]
        System.out.println("Area: " + r1.getArea()); // [cite: 127]
        System.out.println("Color: " + r1.getColor()); // [cite: 129]
        System.out.println("Length: " + r1.getLength()); // [cite: 130]
        // Вывод: getLength() работает, так как r1 имеет статический тип Rectangle.

        // 30. Shape s4 = new Square(6.6); // Upcast [cite: 132]
        Shape s4 = new Square(6.6);
        System.out.println("\n--- s4 (Upcasted Square) ---");

        // 31-33. Проверка s4
        System.out.println(s4); // [cite: 133] -> Square.toString()
        System.out.println("Area: " + s4.getArea()); // [cite: 134] -> Square.getArea() (унаследованный от Rectangle)
        System.out.println("Color: " + s4.getColor()); // [cite: 135]

        // System.out.println(s4.getSide()); // ОШИБКА КОМПИЛЯЦИИ [cite: 136]
        // Объяснение: Ошибка компиляции. У статического типа Shape нет метода getSide().

        // 37. Rectangle r2 = (Rectangle) s4; [cite: 140]
        // Объяснение: Допустимое нисходящее преобразование, так как Square является подклассом Rectangle, а s4 является объектом Square. [cite: 138]
        Rectangle r2 = (Rectangle) s4;
        System.out.println("\n--- r2 (Downcasted Square to Rectangle) ---");

        // 38-42. Проверка r2
        System.out.println(r2); // [cite: 141] -> Square.toString() (Полиморфизм)
        System.out.println("Area: " + r2.getArea()); // [cite: 142] -> Square.getArea() (Полиморфизм)
        System.out.println("Color: " + r2.getColor()); // [cite: 143]
        // System.out.println(r2.getSide()); // ОШИБКА КОМПИЛЯЦИИ [cite: 144]
        // Объяснение: Ошибка компиляции. У статического типа Rectangle нет метода getSide().
        System.out.println("Length: " + r2.getLength()); // [cite: 145] -> Rectangle.getLength() (унаследованный от Shape)

        // 45. Square sq1 = (Square) r2; // Downcast Rectangle r2 to Square [cite: 147, 148]
        Square sq1 = (Square) r2;
        System.out.println("\n--- sq1 (Downcasted Square to Square) ---");

        // 46-50. Проверка sq1
        System.out.println(sq1); // [cite: 149] -> Square.toString()
        System.out.println("Area: " + sq1.getArea()); // [cite: 150] -> Square.getArea()
        System.out.println("Color: " + sq1.getColor()); // [cite: 151]
        System.out.println("Side: " + sq1.getSide()); // [cite: 152]
        System.out.println("Length: " + sq1.getLength()); // [cite: 153]
    }
}
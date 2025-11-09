package ru.mirea.uibo1.grachova.pr8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawingPanel extends JPanel {
    private Shape[] shapes;
    private final int SHAPE_COUNT = 20;

    public DrawingPanel() {
        Random random = new Random();
        shapes = new Shape[SHAPE_COUNT];


        for (int i = 0; i < SHAPE_COUNT; i++) {
            int x = random.nextInt(350);
            int y = random.nextInt(350);


            if (random.nextBoolean()) {

                int radius = random.nextInt(30) + 10;
                shapes[i] = new Circle(x, y, radius);
            } else {

                int width = random.nextInt(50) + 20;
                int height = random.nextInt(50) + 20;
                shapes[i] = new Rectangle(x, y, width, height);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Обязательный вызов

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
package ru.mirea.uibo1.grachova.pr8;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;
    protected static final Random RANDOM = new Random();

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = new Color(
                RANDOM.nextInt(256),
                RANDOM.nextInt(256),
                RANDOM.nextInt(256)
        );
    }

    public abstract void draw(Graphics g);
}
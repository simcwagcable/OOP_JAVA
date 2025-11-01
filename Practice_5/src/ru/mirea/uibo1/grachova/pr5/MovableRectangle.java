package ru.mirea.uibo1.grachova.pr5;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;


    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);


        if (topLeft.getXSpeed() != bottomRight.getXSpeed() ||
                topLeft.getYSpeed() != bottomRight.getYSpeed()) {
            throw new IllegalArgumentException("Скорости двух точек должны совпадать.");
        }
    }

    @Override
    public String toString() {
        return "Movable Rectangle with: " +
                "TopLeft=" + topLeft.toString() +
                ", BottomRight=" + bottomRight.toString();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp(); // [cite: 157]
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown(); // [cite: 158]
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft(); // [cite: 159]
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight(); // [cite: 159]
        bottomRight.moveRight();
    }
}

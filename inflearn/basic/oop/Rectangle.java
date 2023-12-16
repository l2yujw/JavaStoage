package oop;

public class Rectangle {

    int width;
    int height;

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

}

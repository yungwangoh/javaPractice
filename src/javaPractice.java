import java.util.Scanner;

class Circle {
    int x, y;
    float rad;

    void print() {
        System.out.println("[CIRCLE] ("+ x +", "+ y +") r = " +rad);
    }
}

class Ractangle {
    int x, y;
    int width, height;

    protected Ractangle() {}

    public Ractangle(int width, int height) {
        this();
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return width * height;
    }

    void print() {
        System.out.println("getArea() = " + getArea());
    }
}

public class javaPractice {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.rad = 4.0f;
        circle.print();

        Ractangle r = new Ractangle(200, 200);

        r.getArea();
        r.print();

    }
}

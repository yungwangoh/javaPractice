import java.util.Scanner;

class Point {
    float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float getInstance(Point a, Point b) {
        float d = (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y);
        return d;
    }

    float getLength() {
        return getInstance(this, new Point(0,0));
    }

    boolean isNearer(Point in) {
        return(getLength() < in.getLength());
    }

    void print() {
        System.out.println("[POINT] ("+ x + ", "+ y +")");
    }
}
public class javaPractice {
    public static void main(String[] args) {

        MyColorString a = new MyColorString("sejong", "BLACK");
        a.print();
        a.colorPrint();


    }
}

package Bai1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(4.0, 5.0);
        shapes[2] = new Square(2.5);

        Random random = new Random();

        for (Resizeable shape : shapes) {
            double preResizeArea = shape.getArea();
            double percent = random.nextDouble() * 100;
            shape.resize(percent);
            double postResizeArea = shape.getArea();

            System.out.println("Diện tích trước khi tăng kích thước: " + preResizeArea);
            System.out.println("Diện tích sau khi tăng kích thước: " + postResizeArea);
            System.out.println();
        }
    }
}

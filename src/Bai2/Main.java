package Bai2;

public class Main {
    public static void main(String[] args) {
        Shape[]shapes=new Shape[3];
        shapes[0]=new Circle(3.0);
        shapes[1]=new Rectangle(4.0,5.0);
        shapes[2]=new Circle(5.0);

        for (Shape shape: shapes) {
            System.out.println("dien tich: " + shape.getArea());
            System.out.println("chu vi: " +shape.getPerimeter());
            if (shape instanceof Colorable){
                Colorable colorableShare=(Colorable) shape;
                colorableShare.howToColor();
            }
        }

    }
}

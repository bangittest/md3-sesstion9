package bai4;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle("do",4.0,5.0);
        Circle circle=new Circle("xanh", 9.0);

        rectangle.display();

        System.out.println("dien tich hinh chu nhat la : " +rectangle.getArea());


        circle.display();
        System.out.println("dien tich hinh tron : " +circle.getArea());
    }
}

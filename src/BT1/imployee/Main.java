package BT1.imployee;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------Rectange---------------------");
        Rectangle rectangle=new Rectangle(2.4,1.6);
        System.out.println(rectangle);


        rectangle=new Rectangle(2.4, 4.9, "red",true);
//        System.out.println(rectangle);
       rectangle.resize(20);
        System.out.println(rectangle);



    }
}

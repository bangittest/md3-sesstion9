import ra.models.Animal;
import ra.models.IUser;
import ra.models.pl.Dog;
import ra.models.pl.Student;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.makeNoise();

        Animal doggo=new Dog();
        doggo.makeNoise();


        IUser user=new Student();
        user.login("Student" ,"password");

        IUser.noti();
    }
}

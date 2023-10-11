package ra.models.pl;

import ra.models.IUser;

public class Student implements IUser,IStudent {

    @Override
    public void login(String name) {

    }

    @Override
    public void display() {
        System.out.println("nguoi dung la " +name);
    }

    @Override
    public void learn() {
        System.out.println("learn");
    }
}

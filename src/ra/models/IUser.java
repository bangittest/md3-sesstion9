package ra.models;

public interface IUser {

    int cont=0;

    String name="Student";
    String password="password";
    default void login(String name,String password) {
        if (this.name.equals(name)){
            System.out.println("dang nhap thanh cong");
            display();
        }else {
            System.out.println("dang nhap that bai");
        }
    } void login(String name);
    void display();

    static void noti(){
        System.out.println("thong bao cho tat ca nguoi dung");
    }
}

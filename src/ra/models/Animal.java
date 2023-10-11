package ra.models;

public abstract class Animal {
    private  String name;

    public void eat(){
        System.out.println("Animal is eating");
    }
    public  abstract void makeNoise();
}

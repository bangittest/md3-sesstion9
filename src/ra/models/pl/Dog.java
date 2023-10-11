package ra.models.pl;

import ra.models.Animal;

public class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("gau gau");
    }
}

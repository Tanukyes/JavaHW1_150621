package HomeWork6.Animals;

import HW6.Animal.Animal;

public class Dog extends Animal {
    private static int count;
    public Dog(String name,  int maxRunDist, int maxSwimDist) {
        super(name, "Собакен", maxRunDist, maxSwimDist);
        count++;
    }
    public Dog(String name) {
        super(name, "Собакен", 500, 10);
        count++;
    }

    public static int getCount() {
        return count;
    }
}

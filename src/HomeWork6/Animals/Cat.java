package HomeWork6.Animals;

import HW6.Animal.Animal;

public class Cat extends Animal {
    private static int count;
    public Cat(String name, int maxRunDist, int maxSwimDist) {
        super(name, "Кот", maxRunDist, maxSwimDist);
        count++;
    }

    public Cat(String name) {
        super(name,"Кот",200,0);
        count++;
    }

    public static int getCount() {
        return count;
    }
}


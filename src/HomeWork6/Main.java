package HomeWork6;

import HW6.Animal.Animal;
import HW6.Animal.Cat;
import HW6.Animal.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Вася"),
                new Cat("Витя", 1000, 200),
                new Cat("Вова", 500, 100),
                new Dog("Боря"),
                new Dog("Валя", 2000, 300),
                new Dog("Лена", 500, 50),
                new Dog("Кира", 1000, 150)
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(150);
            animals[i].swim(100);
        }
        System.out.println(Animal.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());

    }
}
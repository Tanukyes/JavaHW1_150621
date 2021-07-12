package HW7;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = {
                new Cat("Барсик", 10),
                new Cat("Пушок", 15),
                new Cat("Плюшка", 20),
        };

        Plate plate = new Plate(35);

        System.out.println("У вас есть три кота: " + cat[0].getName() + ", " + cat[1].getName()
                + " и " + cat[2].getName() + ". Они голодные, накорми их!");


        for (int i = 0; i < cat.length; i++) {
            if (cat[i].getSatiety() == false) {
                if (!plate.check(cat[i].getAppetite())) {
                    plate.increase();
                } // 2 пункт
                cat[i].eat(plate);
                System.out.println("Кот " + cat[i].getName() + " съел " + cat[i].getAppetite() + " граммов корма");
            }
            cat[i].setSatiety();
        }
        System.out.println("В миске осталось " + plate.getFood() + " граммов корма\n");

        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i]);
        }

    }
}

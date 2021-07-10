package HW7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }

    boolean getSatiety() {
        return satiety;
    }

    boolean setSatiety() {
        return false;
    }


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.decrease(appetite)) {
            System.out.println(name + " кушает");
            satiety = true;
        } else {
            System.out.println(name + " не кушает");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}

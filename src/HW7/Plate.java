package HW7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decrease(int amount) {
        if (amount < 0 || amount > food) {
            return false;
        }
        food -= amount;
        return true;
    }

    public void increase() {
        this.food += 100;
        System.out.println("В миску добавили 100 грамм корма"); //пункт 6
    }

    boolean check(int amount) {
        return (food - amount) >= 0;
    }


}

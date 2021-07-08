package HomeWork6.Animals;

public class Animal {
    String name;
    String type;
    private static int count;

    int maxRunDist;
    int maxSwimDist;

    public Animal(String name, String type, int maxRunDist, int maxSwimDist) {
        this.name = name;
        this.type = type;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
        count++;
    }

    public void run(int dist) {
        if (maxRunDist == 0) {
            System.out.printf("%s %s не умеет бегать\n", type, name);
            return;
        }
        if (dist < 0) {
            System.out.println("Для бега обратно, введите положительное число");
            return;
        }
        if (dist <= maxRunDist) {
            System.out.printf("%s %s успешно пробежал %d метров\n", type, name, dist);
        } else {
            System.out.printf("%s %s не смог пробежал %d метров\n", type, name, dist);
        }
    }

    public void swim(int dist) {
        if (maxSwimDist == 0) {
            System.out.printf("%s %s не умеет плавать\n", type, name);
            return;
        }
        if (dist < 0) {
            System.out.println("Чтобы плыть обратно, введите положительное число");
            return;
        }
        if (dist <= maxSwimDist) {
            System.out.printf("%s %s успешно проплыл %d метров\n", type, name, dist);
        } else {
            System.out.printf("%s %s не смог проплыть %d метров\n", type, name, dist);
        }
    }

    public static int getCount() {
        return count;
    }
}

package HW2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(method1(10, 5));
        System.out.println(method1(11, 4));
        System.out.println(method1(21, 1));

        method2(0);
        method2(4);
        method2(2);

        System.out.println(method3(3));
        System.out.println(method3(0));
        System.out.println(method3(-1));

        method4("Hello, have a good day!", 6);
    }

    public static boolean method1(int i, int j) {
        int sum = i + j;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void method2(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean method3(int a) {
        if (a <= 0) {
            return false;
        } else {
            return true;
        }
    }


    public static void method4(String word, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(word);
        }


    }

}

package HW3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp3 {
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        task1();
        System.out.println("Задание 2: ");
        task2();
        System.out.println("Задание 3: ");
        task3();
        System.out.println("Задание 4: ");
        task4();
        System.out.println("Задание 5: ");
        task5();
        System.out.println("Задание 6: ");
        task6();
    }

    public static void task1() {
        int[] arr = {1, 0, 0, 0, 1, 1, 0, 1, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task2() {
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    public static void task3() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= arr2[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }


    public static void task4() {
        int[][] arr3 = new int[5][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (i == j) arr3[i][j] = 1;
                else arr3[i][j] = 0;
                System.out.printf("%3d", arr3[i][j]);
            }
            System.out.println();
        }
    }

    public static void task5() {
        int[] intArr = toTask5(5, 10);
        System.out.println(Arrays.toString(intArr));

    }

    public static void task6() {
        int[] arr4 = new int[10];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = random.nextInt(100) - 50;
        }
        System.out.println(Arrays.toString(arr4));
        int min = getMin(arr4);
        System.out.println("Min: " + min);
        int max = getMax(arr4);
        System.out.println("Max: " + max);
    }

    public static int[] toTask5(int len, int initialValue) {
        int[] arr4 = new int[len];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = initialValue;
        }
        return arr4;
    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

}

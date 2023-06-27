package day4;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int element3Sum;
        int element3MaxSum = 0;
        int index = 0;

        for (int i = 0; i < array.length - 2; i++) {
            element3Sum = 0;
            element3Sum = array[i] + array[i + 1] + array[i + 2];

            if (element3Sum > element3MaxSum) {
                element3MaxSum = element3Sum;
                index = i;
            }
        }

        System.out.println(element3MaxSum);
        System.out.println(index);
    }
}
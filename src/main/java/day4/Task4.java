package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int elementSum = 0;
        int elementMaxSum = 0;
        int index = 0;
        int sumCount = 3;

        for (int i = 0; i < array.length - sumCount + 1; i++) {
            for (int j = 0; j < sumCount; j++) {
                elementSum += array[i + j];
            }

            if (elementSum > elementMaxSum) {
                elementMaxSum = elementSum;
                index = i;
            }

            elementSum = 0;
        }

        System.out.println(elementMaxSum);
        System.out.println(index);
    }
}
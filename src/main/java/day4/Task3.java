package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] array = new int[12][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }

        int numbersInLineSum = 0;
        int numbersInLineMaxSum = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                numbersInLineSum += array[i][j];
            }

            if (numbersInLineSum > numbersInLineMaxSum) {
                numbersInLineMaxSum = numbersInLineSum;
                index = i;
            }

            numbersInLineSum = 0;
        }

        System.out.println(index);
    }
}
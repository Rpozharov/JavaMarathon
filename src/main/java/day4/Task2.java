package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int maxElement = array[0];
        int minElement = array[0];
        int elementsEndIn0Count = 0;
        int elementsEndIn0Sum = 0;

        for (int e : array) {
            if (e > maxElement) {
                maxElement = e;
            }

            if (e < minElement) {
                minElement = e;
            }

            if (e % 10 == 0) {
                elementsEndIn0Count++;
                elementsEndIn0Sum += e;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Наибольший элемент массива: " + maxElement);
        System.out.println("Наименьший элемент массива: " + minElement);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + elementsEndIn0Count);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + elementsEndIn0Sum);
    }
}
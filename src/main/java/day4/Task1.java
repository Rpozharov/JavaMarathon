package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }

        System.out.println(Arrays.toString(array));

        int numbersCountMoreThan8 = 0;
        int numbersCountEquals1 = 0;
        int evenNumbersCount = 0;
        int oddNumbersCount = 0;
        int numbersSum = 0;


        for (int e : array) {
            if (e > 8) {
                numbersCountMoreThan8++;
            }

            if (e == 1) {
                numbersCountEquals1++;
            }

            if (e % 2 == 0) {
                evenNumbersCount++;
            }

            if (e % 2 != 0) {
                oddNumbersCount++;
            }

            numbersSum += e;
        }

        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8 : " + numbersCountMoreThan8);
        System.out.println("Количество чисел равных 1 : " + numbersCountEquals1);
        System.out.println("Количество четных чисел : " + evenNumbersCount);
        System.out.println("Количество нечетных чисел : " + oddNumbersCount);
        System.out.println("Сумма всех элементов массива : " + numbersSum);
    }
}
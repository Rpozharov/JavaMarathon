package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = a + 1;

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            while (count < b) {
                if (count % 5 == 0 && count % 10 != 0) {
                    System.out.print(count + " ");
                }

                count++;
            }
        }
    }
}
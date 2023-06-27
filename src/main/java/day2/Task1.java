package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floorsCount = scanner.nextInt();

        if (floorsCount <= 0) {
            System.out.println("Ошибка ввода");
        } else if (floorsCount <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floorsCount <= 8) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}
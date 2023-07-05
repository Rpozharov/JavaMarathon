package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String countryName;

        while (true) {
            String cityName = scanner.nextLine();

            if (cityName.equals("Stop")) {
                break;
            }

            switch (cityName) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    countryName = "Россия";
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    countryName = "Италия";
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    countryName = "Англия";
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    countryName = "Германия";
                    break;
                default:
                    countryName = "Неизвестная страна";
            }

            System.out.println(countryName);
        }
    }
}
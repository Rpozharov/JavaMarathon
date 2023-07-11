package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String string = "0 ";

        for (int i = 1; i <= 20000; i++) {
            string += i + " ";
        }

        long stopTime = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс: " + (stopTime - startTime));

        long startTime1 = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }

        stringBuilder.setLength(stringBuilder.length() - 1);

        long stopTime1 = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс: " + (stopTime1 - startTime1));
    }
}
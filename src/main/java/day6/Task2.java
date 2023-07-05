package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2020, 33, 276);

        airplane.info();

        airplane.setYear(2021);
        airplane.setLength(30);
        airplane.fillUp(2);
        airplane.fillUp(1);
        airplane.info();
    }
}
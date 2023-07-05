package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Лада");
        car.setColor("Зеленый");
        car.setYear(2010);

        car.info();
        System.out.println(car.yearDifference(2020));
    }
}
package day5;

public class Vehicle_Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setModel("Тойота");
        car.setColor("Белый");
        car.setVehicleYear(2018);

        System.out.println("Модель автомобиля: " + car.getModel() + "; Цвет: " + car.getColor() + "; Год выпуска: "
                + car.getVehicleYear() + ";");

        Motorbike motorbike = new Motorbike("Хонда", "Синий", 2012);

        System.out.println("Модель мотцикла: " + motorbike.getModel() + "; Цвет: " + motorbike.getColor()
                + "; Год выпуска: " + motorbike.getVehicleYear() + ";");
    }
}
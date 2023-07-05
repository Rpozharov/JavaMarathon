package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setModel("Тойота");
        car.setColor("Белый");
        car.setVehicleYear(2018);

        System.out.println("Модель автомобиля: " + car.getModel() + "; Цвет: " + car.getColor() + "; Год выпуска: "
                + car.getVehicleYear() + ";");
    }
}
package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Хонда", "Синий", 2012);

        System.out.println("Модель мотцикла: " + motorbike.getModel() + "; Цвет: " + motorbike.getColor()
                + "; Год выпуска: " + motorbike.getVehicleYear() + ";");
    }
}
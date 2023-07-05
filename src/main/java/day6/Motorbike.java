package day6;

public class Motorbike {
    private final String model;
    private final String color;
    private final int year;

    public Motorbike(String model, String color, int vehicleYear) {
        this.model = model;
        this.color = color;
        this.year = vehicleYear;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(year - Math.abs(inputYear));
    }
}
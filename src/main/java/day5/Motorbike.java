package day5;

public class Motorbike {
    private final String model;
    private final String color;
    private final int vehicleYear;

    public Motorbike(String model, String color, int vehicleYear) {
        this.model = model;
        this.color = color;
        this.vehicleYear = vehicleYear;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }
}
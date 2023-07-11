package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("ИЛ", 2020, 30, 15);
        Airplane airplane2 = new Airplane("ТУ", 2021, 30, 15);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
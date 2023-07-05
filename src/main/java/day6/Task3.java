package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванова Мария", "Математика");

        Student student = new Student("Петров Иван");

        teacher.evaluate(student);
    }
}
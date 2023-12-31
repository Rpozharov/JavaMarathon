package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int number = random.nextInt(4) + 2;
        String grade;

        if (number == 2) {
            grade = "неудовлетворительно";
        } else if (number == 3) {
            grade = "удовлетворительно";
        } else if (number == 4) {
            grade = "хорошо";
        } else {
            grade = "отлично";
        }

        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s",
                name, student.getName(), subject, grade);
    }
}
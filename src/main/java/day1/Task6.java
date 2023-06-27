package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 4;
        int count = 1;

        /*for (int i = 1; i < 10; i++){
            System.out.println(i + " * " + k + " = " + (i * k));
        }*/

        while (count < 10) {
            System.out.println(count + " * " + k + " = " + (count * k));
            count++;
        }
    }
}
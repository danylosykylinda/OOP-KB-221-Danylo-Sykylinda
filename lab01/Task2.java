package lab01;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int number = -1;

        Scanner scan = new Scanner(System.in);
        while (number < 0) {
            System.out.println("Enter an integer: ");
            number = scan.nextInt();
            if (number < 0) {
                System.out.println("You've entered something wrong! Please, try again.");
            }
        }
        scan.close();

        int seconds = number % 60;
        int minute = number / 60 % 60;
        int hour = number / 3600 % 24;

        String result = String.format("%02d:%02d:%02d", hour, minute, seconds);
        System.out.println(result);
    }
}

package lab01;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some string: ");
        String inputStr = scanner.nextLine();
        scanner.close();
        System.out.println("Hello, " + inputStr);
    }
}

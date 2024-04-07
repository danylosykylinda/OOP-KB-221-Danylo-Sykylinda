package lab01;

import java.util.Scanner;

public class Task3 {
    final static int password = 997310;

    public static void main(String[] args) {
        int inputPassword = -1;

        Scanner scan = new Scanner(System.in);
        while (inputPassword != password) {
            System.out.println("Enter the password to enter the system: ");
            inputPassword = scan.nextInt();
            if (inputPassword != password) {
                System.out.println("Access denied!");
            }
            else {
                System.out.println("Hello, Agent!");
            }
        }
        scan.close();
    }
}

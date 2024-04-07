package lab01;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int numberStrangers = -1;

        Scanner scanNumber = new Scanner(System.in);
        while (numberStrangers <= 0) {
            System.out.println("Enter the number of strangers: ");
            numberStrangers = scanNumber.nextInt();
            if (numberStrangers <= 0) {
                System.out.println("There are no strangers or a negative number of strangers is entered.");
            }
        }

        Scanner scanNames = new Scanner(System.in);
        while (numberStrangers != 0) {
            System.out.println("Enter the name of a stranger:");
            String nameStranger = scanNames.nextLine();
            System.out.println("Hello, " + nameStranger + "!");
            --numberStrangers;
            
        }
        scanNumber.close();
        scanNames.close();
    }
}

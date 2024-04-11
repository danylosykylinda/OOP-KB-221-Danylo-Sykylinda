package lab01;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        
        Scanner scanNumbers = new Scanner(System.in);
        System.out.println("Find the roots of a square level. Enter the coefficients of the equation separated by a space.");
        String coefs = scanNumbers.nextLine();

        String[] splitCoefs = coefs.split(" ");
        scanNumbers.close();

        int a = Integer.parseInt(splitCoefs[0]);
        int b = Integer.parseInt(splitCoefs[1]);
        int c = Integer.parseInt(splitCoefs[2]);

        double discriminant = Math.pow(b, 2) - 4*a*c;
        if (discriminant < 0) {
            System.out.println("no roots");
        }
        else if (discriminant >= 0) {
        double x1 = (-b + Math.sqrt(discriminant))/(2*a);
        double x2 = (-b - Math.sqrt(discriminant))/(2*a);
        System.out.println("Result: " + "x1 = " + x1 + " and " + "x2 = " + x2);
        }
    }
}

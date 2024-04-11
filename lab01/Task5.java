package lab01;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int currentStep = 0; // for counting the height that the snail has already travelled.
        int day = 0;

        Scanner scanInputData = new Scanner(System.in);
        System.out.println("Enter a(up per day), b(down per day), h(height of the tree) separated by a space: ");
        String inputData = scanInputData.nextLine();
        String[] splitString = inputData.split(" ");
        scanInputData.close();

        int a = Integer.parseInt(splitString[0]);
        int b = Integer.parseInt(splitString[1]);
        int h = Integer.parseInt(splitString[2]);

        if (a <= 0 || b <= 0 || h <= 0) {
            System.out.println("a, b and h cannot be zero or negative! Please, try again.");
        }
        else {
            while (currentStep < h) {
                if ((a == b || a < b) && a != h) {
                    System.out.println("Impossible.");
                    break;
                }
                currentStep = currentStep + a;
                ++day;
                if (currentStep >= h){
                    System.out.println("It takes days: " + day);
                    break;
                }
                else {
                    currentStep = currentStep - b;
                }
            }
        }
    }
}

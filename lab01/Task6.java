package lab01;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanData = new Scanner(System.in);
        System.out.println("Enter the sum to pay and the number of friends separated by a space: ");
        String inputData = scanData.nextLine();
        String[] splitString = inputData.split(" ");

        float check = Float.parseFloat(splitString[0]);
        int amountFriends = Integer.parseInt(splitString[1]);
        scanData.close();

        if (check <= 0) {
            System.out.println("The sum is negative or zero. Try again.");
        }
        else if (amountFriends <= 0) {
            System.out.println("The number of friends is negative or zero. Try again.");
        }
        else {
            float checkWithTips = (check + check / 100 * 10) / amountFriends;
            System.out.println("Each friend has to pay: " + checkWithTips);
        }
    }
}

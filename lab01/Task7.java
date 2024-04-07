package lab01;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        
        int maxValue = Integer.MIN_VALUE;

        Scanner scanRange = new Scanner(System.in);
        System.out.println("Find max value. Enter a sequence of numbers. Enter zero and press enter to finish.");

        String inputRange = scanRange.nextLine();
        if (inputRange != "" && !inputRange.equals("0")) {

        String[] splitRange = inputRange.split(" ");
        int[] rangeNumbers = new int[splitRange.length];
        scanRange.close();

        for (int i = 0; i < rangeNumbers.length; i++) {
            rangeNumbers[i] = Integer.parseInt(splitRange[i]);
            if (rangeNumbers[i] != 0 && (maxValue < rangeNumbers[i])){
                maxValue = rangeNumbers[i];
            }
            else if (rangeNumbers[i] == 0) {
                System.out.println("Max value: " + maxValue);  
                break;
            }
            if (rangeNumbers[i] != 0 && i == rangeNumbers.length - 1){
                System.out.println("You did not end the sequence with a zero. Try again.");
            }
        }
        }
        else {
            System.out.println("You have entered a sequence with no numbers in it. Try again.");
        }  
    }
}

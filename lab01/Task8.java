package lab01;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        
        int sumRange = 0;

        Scanner scanRange = new Scanner(System.in);
        System.out.println("Find average number. Enter a sequence of numbers. Enter zero and press enter to finish.");

        String inputRange = scanRange.nextLine();
        if (inputRange != "" && !inputRange.equals("0")) {

        String[] splitRange = inputRange.split(" ");
        int[] rangeNumbers = new int[splitRange.length];
        scanRange.close();

        for (int i = 0; i < rangeNumbers.length; i++) {
            rangeNumbers[i] = Integer.parseInt(splitRange[i]);
            if (rangeNumbers[i] != 0){
                sumRange += rangeNumbers[i];
            }
            else if (rangeNumbers[i] == 0) {
                float averageValue = (float) sumRange / (rangeNumbers.length - 1);
                System.out.println("Avarage value: " + averageValue);  
                break;
            }
            if (rangeNumbers[i] != 0 && i == rangeNumbers.length-1){
                System.out.println("You did not end the sequence with a zero. Try again.");
            }
        }
        }
        else {
            System.out.println("You have entered a sequence with no numbers in it. Try again.");
        }  
    }
        
    }

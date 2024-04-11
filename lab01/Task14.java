package lab01;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
    int[] unshiftedList = {1, 3, 2, 7, 4};
    cycleSwap(unshiftedList);
    cycleSwap(unshiftedList,3);
}

public static void cycleSwap(int[] array) {
    int[] shiftedList = new int[array.length];

    if (array.length >= 1) {
        for (int i = 1; i < array.length; i++) {
            shiftedList[i] = array[i-1];
        }
        shiftedList[0] = array[array.length-1];
        System.out.println(Arrays.toString(shiftedList));
    }
    else{
        System.out.println("The array has no numbers. Try again!");
    }
}

public static void cycleSwap(int[] array, int shift) {
    int[] shiftedList = new int[array.length];

    if (array.length >= 1 && shift <= array.length && shift >= 0) {
        for (int i = shift; i < array.length; i++) {
            shiftedList[i] = array[i-shift];
        }

        for (int i = 0; i < shift; i++) {
        shiftedList[i] = array[array.length - shift + i];
        }
        System.out.println(Arrays.toString(shiftedList));
    }
    else{
        System.out.println("The array has no numbers or shift more than length of the array. Try again!");
    }
}
}

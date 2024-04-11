package lab01;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] array = {1, -1, 0, 4, 6, 10, 15, 25};  

        if (array.length > 2) {
        System.out.println(Arrays.toString(getSumCheckArray(array)));
        }
        else {
            System.out.println("The array must consist of at least two or more numbers");
        }
}
    public static boolean[] getSumCheckArray(int[] arr) {
        boolean[] booleanValues = new boolean[arr.length];
        booleanValues[0] = booleanValues[1] = false;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == arr[i-1] + arr[i-2]) {
                booleanValues[i] = true;
            }
        }
        return booleanValues;
    }
}

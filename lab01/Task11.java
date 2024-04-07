package lab01;

public class Task11 {
    public static void main(String[] args) {
        int[] array = {5, 50, 71, 3, -5, 8, 101, 35, -89, 20};
        int sumOfArray = 0;

        if (array.length == 0) {
            System.out.println("Sum of the array: " + sumOfArray);
        }
        else {
            sumOfArray = sum(array);
            System.out.println("Sum of the array: " + sumOfArray);
        }
    }
    public static int sum(int[] arr) {
        int sumOfArray = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumOfArray += arr[i];
            }
        }
        return sumOfArray;
}
}

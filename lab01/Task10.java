package lab01;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {5, 50, 71, 3, -5, 8, 101, 35, -89, 20};

        if (array.length == 0) {
            System.out.println("Error! The array has no numbers.");
        }
        else {
            int max = max(array);
            System.out.println("Max value: " + max);
        }
    }
    public static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
}
}

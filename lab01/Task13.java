package lab01;

import java.util.ArrayList;
import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int[] array = {18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
}
    public static int[] removeLocalMaxima(int[] arr){
        ArrayList<Integer> removeLocalMaximaList = new ArrayList<>();
        if (arr.length < 3) {
            return arr;
        }
        if (arr[0] < arr[1]) {
            removeLocalMaximaList.add(arr[0]);
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i-1] < arr[i] && arr[i+1] < arr[i]) {
                continue;
            }
            else {
            removeLocalMaximaList.add(arr[i]);
            }
        }
        if (arr[arr.length-1] < arr[arr.length-2]) {
            removeLocalMaximaList.add(arr[arr.length-1]);
        }
        return removeLocalMaximaList.stream().mapToInt(Integer::intValue).toArray();
    }
}

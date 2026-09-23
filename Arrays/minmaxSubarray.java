package Arrays;

import java.util.*;

public class minmaxSubarray {
    public static void minmaxSubarray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int start = i;
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
        }
        System.out.println("Maximum Sum Value of the SubArray is :" + max);
        System.out.println("Minimum Sum Value of the SubArray is :" + min);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        minmaxSubarray(arr);

    }

}

package Arrays;
import java.util.*;

public class sumofSubarray {
    public static void sumofSubarray(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int start = i;
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    // System.out.print(arr[k]+" ");
                    sum = sum + arr[k];
                }
                System.out.print("sum = " +sum+",");
                // System.out.println();
            }
            // System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        sumofSubarray(arr);

    }

}

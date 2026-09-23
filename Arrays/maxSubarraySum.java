package Arrays;
import java.util.*;

public class maxSubarraySum{
    public static void maxSubarraysum(int arr[]) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1;i<prefix.length;i++){ //new prefix array
            prefix[i]=prefix[i-1]+arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start==0?prefix[end]:prefix[end]-prefix[start-1];//there is not exist of index -1 so we keep end as it is its value is arr[0]
                if (currSum > max) {
                    max = currSum;
                }
            }
        }
        System.out.println("Maximum Sum Value of the SubArray is :" + max);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3,6};
        maxSubarraysum(arr);

    }
}

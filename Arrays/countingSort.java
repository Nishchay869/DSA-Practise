import java.util.*;
public class countingSort {
    public static void counterSort(int arr[]){
        //frequency
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j =0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }

        }

    }
    //printing
    public static void printt(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args){
        int arr[] = {1,4,3,2,6,7,6,3};
        counterSort(arr);
        printt(arr);
    }
}

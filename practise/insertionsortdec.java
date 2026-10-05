import java.util.*;

public class insertionsortdec {
    //insertion sort
    public static void InsertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;

            }
            arr[prev+1] = curr;
        }
    }


     //printing
    public static void printt(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String args[]){
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        InsertionSort(arr);
        printt(arr);
    }
    
}

import java.util.*;

public class bubblesortdec {
    
    public static void bubbledec(int arr[]){
        int n =arr.length;
        for(int i =0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
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
        bubbledec(arr);
        printt(arr);
    }
}

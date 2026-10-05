import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {
//normal sorting ascending
    public static void sort(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    } 
//for perticular index sort
    public static void indexSort(int arr[]){
        Arrays.sort(arr,1,4);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
// decending sort
    public static void decendingSort(Integer arr[]){
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    public static void main(String[] args){
        //Integer arr[] = {5,3,4,8,6}; for decendingSOrt
        int arr[]={5,3,4,8,6};
        indexSort(arr);
    }
    
}

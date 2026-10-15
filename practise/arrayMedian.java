
package practise;
import java.util.*;

public class arrayMedian {
    public static void Median(int arr1[],int arr2[]){
        
        int result[] = new int[arr1.length+arr2.length];
        int n = result.length;
        for(int i=0;i<arr1.length;i++){
            result[i] =  arr1[i];

        }
        for(int i=0;i<arr2.length;i++){
            result[arr1.length+i] = arr2[i];
        }
        Arrays.sort(result);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+",");
        }
        if(n%2!=0){
            double median = result[n/2];
            System.out.print(median);

        }else{
            double median = (result[n / 2] + result[n / 2-1]) / 2.0;
            System.out.print(median);
        }
       
       
    }
    
    public static void main(String args[]){
        int arr1[] = {1,2};
        int arr2[] = {3,6,7,6};
        Median(arr1,arr2);
        
    }
    
}

package Sorting;
import java.util.*;
public class bubbleSort{
    public static void bubblesort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            boolean Swapped = false;
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]<nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    Swapped = true;
                }
            }
             if (!Swapped) {
            break;
        }
        }
    }
    public static void main(String[] args){
        int nums[] = {5,4,1,3,2};
        bubblesort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
        
    }
}
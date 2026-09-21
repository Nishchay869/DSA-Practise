package Arrays;
import java.util.*;
public class linearSearch{
    public static int linearsearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int number[] = {2,3,4,5,7,8,9,12,13};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key for search");
        int key = sc.nextInt();
        int index = linearsearch(number,key);
        if(index == -1){
        System.out.println("Not found!");
        }else{
            System.out.println("key at the index of :"+index);
        }

    }
}
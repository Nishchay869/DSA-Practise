package Arrays;

public class reverseofarray {
    public static void Rev(int number[]){
        int start = 0,end = number.length-1;
        while(start<end){
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
        return;
    }
    public static void main(String[] args){
        int number[] = {1,3,4,5,6};
        Rev(number);
        for(int i=0;i<=number.length-1;i++){
            System.out.print(number[i]+",");
        }
        

    }
    
}

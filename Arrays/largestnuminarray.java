package Arrays;

public class largestnuminarray {
    public static int largeNum(int number[]){
        int largestNum = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            
            if(number[i]>largestNum){
                largestNum = number[i];
            }
            
        }
        return largestNum;
    }
    public static void main(String args[]){
        int number[]={2,4,9,5,8};
        int large = largeNum(number);
        System.out.println("the largest value is"+large);

    }
    
}

package bitManipulation;

public class ithbit {
    public static int ithbit(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }

    }
    public static void main(String[] args){
        int maskbit = 1;
        System.out.print(ithbit(5,2));

    }
    
}

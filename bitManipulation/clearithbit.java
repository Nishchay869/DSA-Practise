package bitManipulation;

public class clearithbit {
    public static int clrithbit(int n,int i){
        int bitmask = 0<<i;
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(clrithbit(52,2));

    }
    
}

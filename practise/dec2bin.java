package practise;
import java.util.*;
public class dec2bin {
    public static void dec2bin(int n){
        int pow = 0;
        int bin = 0;
        while(n>0){
            int rem = n%2;
            bin = bin+(rem*(int)Math.pow(10,pow));
            n = n/2;
            pow++;
            System.out.print("binary value = "+ bin);
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dec2bin(n);

    }
}

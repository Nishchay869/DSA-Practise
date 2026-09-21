package practise;
import java.util.*;
public class bin2dec {
    public static void b2d(int n){
        int pow = 0;
        int dec = 0;
        while(n>0){
            int last_digit = n%10;
            dec = dec+(last_digit*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
       System.out.print("Decimal = " + dec);
        


        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        b2d(n);


    }
}

package practise;
import java.util.*;

public class prime {
    public static boolean checkPrime(int n) {
        if(n==2){
            return true;
        }
        for (int i = 2; i <=
            Math.sqrt(n); i++) {// optimized else keep i<n-1
            if (n % i == 0) {
                return false;
            
            }
        }
        return true;

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        System.out.print(checkPrime(4));

    }
}

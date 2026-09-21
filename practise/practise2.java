package practise;
import java.util.*;
public class practise2 {
    public static boolean isEven(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to check even or not: ");
        int n = sc.nextInt();
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.print(isEven());

    }
}

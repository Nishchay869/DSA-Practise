package practise;
import java.util.*;
public class binarytriangle {
    public static void binaryTriangle(int n){
         int count =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(count%2==0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
                count=count+1;
                
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of line binary triangle need to print: ");
        int n = sc.nextInt();
        binaryTriangle(n);
       
    }
}

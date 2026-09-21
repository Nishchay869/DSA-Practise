package practise;
import java.util.*;
public class rhoumbus {
    public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for star
            for(int j =1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rhombus(n);

    }
}

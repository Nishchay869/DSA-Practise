package practise;
    import java.util.*;
public class hollowrhombo {
    public static void hollowrhombus(int n){
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for star
            for(int j =1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hollowrhombus(n);

    }
}



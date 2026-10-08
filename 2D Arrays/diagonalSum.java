import java.util.*;
public class diagonalSum {
    public static void diagonalSum(int matrix[][]){
        int sum = 0;
        int primary_sum = 0;
        int seconday_sum = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                sum+=matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum+=matrix[i][j];

                }
            }
        }
        System.out.print(sum);
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
        System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        diagonalSum(matrix);
    }
    
}

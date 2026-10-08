import java.util.*;
public class minvalue {
    public static void printt(int matrix[][]){
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void min(int matrix[][]){
        int min = Integer.MAX_VALUE;    
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("The Smallest Number in the matrix is: "+ min);
    }
    public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
        int matrix[][] = new int[3][3];
        System.out.println("Enter the Element to the array: ");
        for(int i =0 ;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                
                matrix[i][j] = sc.nextInt(); 
            }
        }
        printt(matrix);
        min(matrix);

       
    
}

}

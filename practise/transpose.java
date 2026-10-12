package practise;

public class transpose {
    public static void transpose(int matrix[][]){
        int row = 2,col=3;
        int [][] transpose = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i] = matrix[i][j];
            }
        }

    for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+",");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][]= {{11,12,13},{21,22,33}};
         transpose(matrix);
        
            
        }
    }
    
    


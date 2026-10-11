public class staircaseSearch {
    public static boolean stairSearch(int matrix[][],int key){     //top-right search
        int row =0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.print("the key found at:("+row+","+col);
                return true;
            }
            else if(matrix[row][col]<key){
                row++;
            }
            else{
                col--;
            }
        }
         System.out.print("the key not found ");
         return false;
    }
    public static boolean stairs(int matrix[][],int key){ //bottom-left search
        int row = matrix.length-1;
        int col = 0;
        while(row>=0&& col<=matrix[0].length-1){
            if(key==matrix[row][col]){
                System.out.print("the key at:("+row+","+col+")");
                return true;
            }
            else if(key>matrix[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
        System.out.print("the key not found ");
         return false;
        
    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key = 540;
        stairs(matrix,key);

    }
}

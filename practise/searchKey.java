public class searchKey {
    public static int[] searchKey(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};

    }
   
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key = 37;
        int[] index = searchKey(matrix,key);
        if(index[0] == -1&&index[1]==-1){
            System.out.print("key not fount");
        }
            else{
                System.out.println("key found at index"+index[0]+","+index[1]);
        }
    }
    
}

package practise;

public class count {
    public static void Count(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    count+=1;
                }
            }

        }
        System.out.print("the key 8 present "+count+" number of time");

    }

    public static void main(String args[]) {
        int matrix[][] = { { 4, 7, 8 },
                { 8, 8, 7 } };
        int key = 8;
        Count(matrix, key);
    }

}

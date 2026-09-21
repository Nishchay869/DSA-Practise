package practise;
//Bubble Sort.
import java.util.*;

public class Bubblesort {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 2, 6, 7, 10 };
        int n = 7;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
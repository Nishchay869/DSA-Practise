package practise;
public class Selectionsort {
    public static void main(String args[]) {
        int arr[] = { 1, 3, 4, 2, 6, 7, 10, 54 };
        int n = 8;
        for (int i = 0; i < n-1; i++) {
            int mx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[mx]) {
                    mx = j;
                }
                

            }
            int temp = arr[i];
            arr[i] = arr[mx];
            arr[mx] = temp;
            
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

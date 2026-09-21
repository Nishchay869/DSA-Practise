package practise;
public class insertionsort {
    public static void main(String args[]){
        int arr[] = {1,3,2,5,6,10,44,55,22,44};
        int n = 10;
        for(int i =1;i<n;i++){
            int key = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;

        }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
    }
    }
}

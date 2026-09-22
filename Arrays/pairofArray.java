package Arrays;

public class pairofArray {
    public static void pairofArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+" "+arr[j]+")"+",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10};
        pairofArray(arr);

    }
    
}

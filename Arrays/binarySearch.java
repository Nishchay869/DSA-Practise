package Arrays;

public class binarySearch {
    public static int binarySearch(int number[],int key){
        int start = 0,end = number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid] == key){
                return mid;
            }if(number[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int number[] = {2,3,4,5,6,7,8,9,12};
        int key = 19;
        int index = binarySearch(number,key);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("the value 12 is the index of" + index);
        }

    }
    
}

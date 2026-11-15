package bitManipulation;

public class evenorodd {
    public static void evenorodd(int n,int maskbit){
        if((n & maskbit) == 0){
            System.out.println("its even");
        }
        else{
            System.out.println("its odd");
        }

    }
    public static void main(String args[]){
        int maskbit = 1;
        evenorodd(66,maskbit);
    }
    
}

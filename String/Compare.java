package String;

public class Compare {
    public static void main(String args[]){
        String S1 = "Nishu";
        String S2 = "Nishu";
        String S3 = new String("Nishu");
        // if(S1 == S2){
        //     System.out.println("string are same");
        // }
        // else{
        //     System.out.println("Strings are not same");
        // }
        // 
        if(S1.equals(S3)){
            System.out.println("string are same");
        }
        else{
            System.out.println("Strings are not same");         //its must usswe in the java
        }
    }
    
}

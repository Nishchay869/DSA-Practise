package practise;
import java.util.*;

public class anagram {
    public static void anagram(String str1,String str2){
        //to to lower
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //check equal
        if(str1.length() == str2.length()){
            //to array
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str1.toCharArray();
         //to sort
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        //iss equals
        boolean result = Arrays.equals(str1Array,str2Array);
        if(result == true){
            System.out.print("its anagram");
        }else{
            System.out.println("not anagram");
        }
        }
        else{
            System.out.println("not a anagram");
        }
        
    }
    public static void main(String args[]){
        String str1 = "rae";
        String str2 = "care";
        anagram(str1,str2);

    }
    
}

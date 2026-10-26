package practise;

public class countvowels {
    public static int countVowel(String name){
        int count =0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'u' ){
                count++;
            }
        }
        return count;

    }
    public static void main(String args[]){
        String name = "nishchy";
        int total = (countVowel(name));
        if(total<1){
            System.out.println("Vowels are not found in this String");
        }
        else{
            System.out.println(total+" "+ "vowels are found in this string");
        }
    }
    
}

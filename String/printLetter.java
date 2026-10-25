package String;

public class printLetter {
    public static void PrintLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

    }
    public static void main(){
        String str = "Nishu";
        PrintLetter(str);

    }
    
}

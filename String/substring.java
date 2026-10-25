package String;

public class substring {
    public static String substring(String word,int si,int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += word.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String word = "Helloword";
        // System.out.print(word.substring(0,4));                  //java built in fuction
        System.out.print(substring(word,0,4));
    }
    
}

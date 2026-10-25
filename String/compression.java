package String;

public class compression {
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        String Compress = "";
        for(int i=0;i<str.length()-1;i++){
            Integer count = 1;
            while(str.charAt(i)==str.charAt(i+1) && i<str.length()-1){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(){
        String str = "abbbccd"; 
        System.out.print(compress(str));
    }
    
}

package bitManipulation;

public class And {
    public static void and(int a,int b){
        System.out.println(a&b);
    }
    public static void or(int a,int b){
        System.out.println(a|b);
    }
    public static void xor(int a,int b){
        System.out.println(a^b);
    }
    public static void not(int a){
        System.out.println(a);
    }
    public static void leftbit(int a,int b){
        System.out.println(a<<b);
    }
    public static void rightbit(int a,int b){
        System.out.println(a>>b);
    }
    public static void main(String[] args){
       int a = 6;
       int b =2;
       and(a,b);
       or(a,b);
       xor(a,b);
       not(a);
       leftbit(a,b);
       rightbit(a,b);
    }
}

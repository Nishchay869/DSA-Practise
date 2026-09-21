package practise;
public class palindrome {
    public static boolean isPalindrome(int n){
        int real_num = n;
        int reverse=0;
        while(n>0){
            reverse = reverse*10+n%10;
            n = n/10;        
        }
        if(reverse==real_num){
                return true;
            }
        return false;

    }
    public static void main(String args[]){
        System.out.print(isPalindrome(127));

    }
    
}

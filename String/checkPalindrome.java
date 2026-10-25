package String;

public class checkPalindrome {
    public static boolean isPalindrome(String Name) {

        for (int i = 0; i < Name.length() / 2; i++) {
            int n = Name.length();

            if (Name.charAt(i) != Name.charAt(n - 1 - i)) {
                return false;

            }

        }
        return true;

    }

    public static void main(String args[]) {
        String Name = "medam";
        System.out.print(isPalindrome(Name));

    }

}

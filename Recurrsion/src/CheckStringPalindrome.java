import java.util.Scanner;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(checkPalindrome(str,1));
    }
    public static boolean checkPalindrome(String str, int i){
        if(i > str.length()/2) return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return checkPalindrome(str,i+1);
    }
}

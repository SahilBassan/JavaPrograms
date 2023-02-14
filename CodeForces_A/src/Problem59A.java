import java.util.Scanner;
//<a href = "https://codeforces.com/contest/59/problem/A" />
public class Problem59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int lowCount = 0;
        int upCount = 0;
        int count = 0;
        for(int i=0; i<str.length(); i++){
            count = (Character.isUpperCase(str.charAt(i))) ? upCount++ : lowCount++;
        }
        System.out.println( (upCount>lowCount)? str.toUpperCase() : str.toLowerCase());
    }
}

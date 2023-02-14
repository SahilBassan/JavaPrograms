import java.util.Arrays;
import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/141/A" />

public class Problem141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String aPlusB = a+b;
        char[] x = aPlusB.toLowerCase().toCharArray();
        char[] y = c.toLowerCase().toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
//        System.out.println(Arrays.toString(x));
//        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.equals(x,y)? "YES" : "NO");
    }
}

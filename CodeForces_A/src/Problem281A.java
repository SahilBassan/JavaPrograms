import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/281/A" />
public class Problem281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(Character.isLowerCase(str.charAt(0))){
            System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
        }else {
            System.out.println(str);
        }
    }
}

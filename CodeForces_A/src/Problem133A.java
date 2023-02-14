import java.util.Scanner;
//<a href = "http://codeforces.com/problemset/problem/133/A" />
//<a href = "https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html"/>  // ASCII Table
public class Problem133A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(HQ9(str));
    }
    static String HQ9(String str){
        for(int i=0; i<str.length(); i++){
//            ASCII Code for capital H is 72 -- for capital Q is 81 -- for 9 is 57
            if(str.charAt(i) == 72 || str.charAt(i) == 81 || str.charAt(i) == 57){
                return "YES";
            }
        }
        return "NO";
    }
}

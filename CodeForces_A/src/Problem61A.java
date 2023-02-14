import java.util.Scanner;
//<a href = "https://codeforces.com/contest/61/problem/A" />
public class Problem61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        String res = "";
        for(int i=0; i<num1.length(); i++){
            if (Integer.parseInt(num1.charAt(i) + "") == Integer.parseInt(num2.charAt(i) + "")) {
                res += "0";
            }else {
                res += "1";
            }
        }
        System.out.println(res);
    }
}

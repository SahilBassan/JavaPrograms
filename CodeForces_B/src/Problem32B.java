import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/32/B" />
public class Problem32B {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.next();
        int pos = 0;
        StringBuilder str2 = new StringBuilder();
        while (pos < str.length()){
            if(str.charAt(pos) == '.'){
                str2.append('0');
                pos++;
            } else if (pos < str.length()-1 && str.charAt(pos) == '-' && str.charAt(pos+1) == '.') {
                str2.append('1');
                pos += 2;
            } else if (str.charAt(pos) == '-' && str.charAt(pos+1) == '-'){
                str2.append('2');
                pos += 2;
            }
        }
        System.out.println(str2);
    }
}

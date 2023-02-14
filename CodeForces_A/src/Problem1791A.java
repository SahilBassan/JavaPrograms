import java.util.Scanner;

public class Problem1791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            char c = sc.next().charAt(0);
            String str = "codeforces";
            if(str.indexOf(c) != -1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}

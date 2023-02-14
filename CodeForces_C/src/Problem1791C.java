import java.util.Scanner;

public class Problem1791C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); sc.nextLine();
            String str = sc.nextLine();
            int l = 0;
            int r = n-1;
            while (l<r){
                char left = str.charAt(l);
                char right = str.charAt(r);
                if(left == right){
                    break;
                }else {
                    r--;
                    l++;
                    n -= 2;
                }
            }
            System.out.println(n);
        }
    }
}

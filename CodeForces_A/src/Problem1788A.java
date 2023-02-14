import java.util.Scanner;

public class Problem1788A {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int two = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 2) two++;
        }
        if (two % 2 == 1)
            System.out.println(-1);
        else {
            int current_two = 0;
            int k = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] == 2) current_two++;
                if (current_two == two / 2) {
                    k = i;
                    break;
                }
            }
            System.out.println(k + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
            solve();
    }
}

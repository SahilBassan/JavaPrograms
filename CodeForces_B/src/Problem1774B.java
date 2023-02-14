import java.util.Scanner;

//<a href = "https://codeforces.com/contest/1774/problem/B" />
public class Problem1774B {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] colors = new int[m];
            int max = 0;
            for (int i=0; i<m; i++){
                colors[i] = sc.nextInt();
                max = Math.max(max, colors[i]);
            }
            if(max > ((n+k-1)/k)){
                System.out.println("no");
            }else {
                System.out.println("yes");
            }
        }
    }
}

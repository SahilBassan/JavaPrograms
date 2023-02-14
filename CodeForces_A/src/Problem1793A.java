import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1793A{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int[] max = new int[n];
            max[0] = arr[0];
            int[] min = new int[n];
            min[0] = arr[0];
            for(int i = 1; i<n; i++){
                max[i] = Math.max(max[i - 1], arr[i]);
                min[i] = Math.min(min[i - 1], arr[i]);
            }
            int ans = -1;
            for(int i = 0; i<n; i++){
                if(arr[i] != min[i] && arr[i] != max[i]){
                    ans = i + 1;
                    break;
                }
            }
            if(ans == -1)pw.println(ans);
            else pw.println(ans + " " + ans);
        }
        pw.flush();
    }
}



//import java.util.Scanner;
//
//public class Problem1793A {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-->0){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            System.out.println(solve(a,b,n,m));
//        }
//    }
//    public static long solve(int a, int b, int n, int m){
//        long x = (long) b *n;
//        long y = (long) a *(n/(m+1)) *m;
//        y += Math.min(n%(m+1) * a, n%(m+1)*b);
//        return Math.min(x,y);
//    }
//}
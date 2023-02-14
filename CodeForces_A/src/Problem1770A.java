import java.util.Arrays;
import java.util.Scanner;

public class Problem1770A {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-->0){
            System.out.println(solver());
        }
    }
    private static long solver(){
//        PriorityQueue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        long[] b = new long[m];
        for (int i=0; i<m; i++){
            b[i] = sc.nextLong();
//            queue.add(b[i]);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<m && i<n; i++){
//            if(queue.isEmpty()) break;
//            if(a[i] >= b[m-1] && i>0) break;
            a[i] = b[m-1-i];
        }
        long answer = 0;
        for (int i=0; i<n; i++){
            answer += a[i];
        }
        return answer;
    }
}
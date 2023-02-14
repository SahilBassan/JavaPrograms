import java.util.HashMap;
import java.util.Scanner;

public class Problem1791E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            HashMap<Integer, Long> map = new HashMap<>();
            int n = sc.nextInt();
            int q = sc.nextInt();
            long[] arr = new long[n];
            for (int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            while (q-->0){
                int[] query = {0,0,0};
                query[0] = sc.nextInt();
                query[1] = sc.nextInt();
                if(query[0] == 1) query[2] = sc.nextInt();
                if(query[0] == 1){
                    for(int i=(query[1]-1); i<=(query[2]-1); i++){
                        map.put(i,arr[i]);
                    }
                }else {
                    System.out.println(arr[query[1]-1]);
                }
            }
        }
    }
    public static int sum(long n){
        int sum = 0;
        while (n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}

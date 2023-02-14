import java.util.Scanner;

public class Problem1772D {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-->0){
            System.out.println(solver());
        }
    }
    private static int solver(){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n-1; i++){
            arr[i] = sc.nextInt();
        }
        int x = Integer.MIN_VALUE;
        for (int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                int z = arr[i+1]+(arr[i] - arr[i+1]+1)/2;
                x = Math.max(z,x);
            }
        }
        if(x == Integer.MIN_VALUE){
            return 0;
        }
        for (int i=0; i<n; i++){
            if(arr[i] > arr[i-1]){
                return -1;
            }
        }
        return x;
    }
}

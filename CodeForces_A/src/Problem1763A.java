import java.util.Scanner;

public class Problem1763A {
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
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int f = arr[0];
        int r = arr[0];
        for (int i=1; i<n; i++){
            f = f | arr[i];
            r = r & arr[i];
        }
        return (f-r);
    }
}

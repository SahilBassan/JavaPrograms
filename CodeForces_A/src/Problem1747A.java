import java.util.Scanner;
//<a href = "https://codeforces.com/contest/1747/problem/A" />

public class Problem1747A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int num = sc.nextInt();
            int[] arr = new int[num];
            long sum = 0;
            for(int j=0; j< arr.length; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            System.out.println(Math.abs(sum));
        }
    }
}

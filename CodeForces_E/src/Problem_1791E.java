//Accepted

import java.util.Scanner;

public class Problem_1791E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count = 0;
            long sum = 0;
            for (int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] <= 0) count++;
                sum += Math.abs(arr[i]);
            }
            if(count%2 == 0){
                System.out.println(sum);
            }else {
                int min = Integer.MAX_VALUE;
                for (int i : arr){
                    min = Math.min(min,Math.abs(i));
                }
                System.out.println(sum - (2L *min));
            }
        }
    }
}

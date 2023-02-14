import java.util.Scanner;

public class Problem450A_2 {
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int candies = sc.nextInt();
        int[] distribution = new int[n];
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            distribution[i] = sc.nextInt();
            arr[i] = i + 1;
        }
    }
}


import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/200/B" />

public class Problem200B {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        double[] arr = new double[num];
        double total = (double) 100/num;
        double result = 0;
        for(int i=0; i<num; i++){
            arr[i] = sc.nextDouble();
        }

        for(int i=0; i<num; i++){
            result += total /((double) 100/arr[i]);
        }
        System.out.println(result);
    }
}

import java.util.Scanner;

public class Sum_Of_First_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sumOfFirstNNumbers(n,sum);
        System.out.println(sumOfFirstNNumbers(n));
    }
    // Functional approach
    public static int sumOfFirstNNumbers(int n){
        if(n==0){
            return 0;
        }
        return n + sumOfFirstNNumbers(n-1);
    }

    // Parameterised approach
    public static void sumOfFirstNNumbers(int n, int sum){
        //base condition
        if(n<1) {
            System.out.println(sum);
            return;
        }
        sumOfFirstNNumbers(n-1,sum+n);
    }
}

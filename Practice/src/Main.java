import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        int res = 1;
        for(int i=n; i>0; i--){
            res *= i;
        }
        return res;
    }
}

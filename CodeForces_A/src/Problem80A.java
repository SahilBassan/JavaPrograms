import java.util.Scanner;
//<a href = "https://codeforces.com/contest/80/problem/A" />
public class Problem80A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean flag = false;
        if(isPrime(num2)){
            while (num1 < num2-1){
                flag = isPrime(num2-1);
                if(flag == true) break;
                num2--;
            }
            if(!flag){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }else {
            System.out.println("NO");
        }
    }

    public static boolean isPrime(int number){
        for(int i=2; i<=number/2; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}

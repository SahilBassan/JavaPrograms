import java.util.Scanner;

public class Starter77D_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-->0){
            int jerry = sc.nextInt();
            int tom = sc.nextInt();
            System.out.println(tom>jerry ? "YES" : "NO");
        }
    }
}

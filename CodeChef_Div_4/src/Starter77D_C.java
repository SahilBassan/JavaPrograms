import java.util.Scanner;

public class Starter77D_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-->0){
            int a = sc.nextInt();
            int b = sc.nextByte();
            int c = sc.nextInt();
            int min = Math.min(b,c);
            b -= min;
            c -= min;
            System.out.println((a > b && a > c) ? "YES" : "NO");
        }
    }
}

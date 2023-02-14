import java.util.Scanner;

public class Problem1772C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a = 1;
            System.out.print("1" + " ");
            for (int i=1; i<=n-1; i++){
                if(k - a - i + 1 >= n-i){
                    a += i;
                }else a++;
                System.out.print( a + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Problem1779B {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-->0){
            solver();
            System.out.println();
        }
    }
    private static void solver(){
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("YES");
            for(int i=0; i<n; i++){
                if(i%2==0) System.out.print(1 + " ");
                else System.out.print(-1 + " ");
            }
        }else if(n==3){
            System.out.println("NO");
        }else {
            System.out.println("YES");
            int temp = n/2;
            for(int i=0; i<n/2; i++){
                System.out.print(1-temp + " " + temp + " ");
            }
            System.out.print(1-temp);
        }
    }

}

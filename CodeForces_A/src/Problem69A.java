import java.util.Scanner;

//<a href="https://codeforces.com/contest/69/problem/A"/>

public class Problem69A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumX = 0;
        int sumY = 0;
        int sumZ = 0;
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            sumX += x;
            int y = sc.nextInt();
            sumY += y;
            int z = sc.nextInt();
            sumZ += z;
        }
        if(sumX==0 && sumY==0 && sumZ==0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}

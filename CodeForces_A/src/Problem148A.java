import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/148/A" />
public class Problem148A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dragonK = sc.nextInt();
        int dragonL = sc.nextInt();
        int dragonM = sc.nextInt();
        int dragonN = sc.nextInt();
        int total = sc.nextInt();
        System.out.println(dragonCount(dragonK,dragonL,dragonM,dragonN,total));
    }
    public static int dragonCount( int dragonK, int dragonL, int dragonM, int dragonN, int total ) {
        int count = 0;
         if (dragonK>total || dragonL>total ||dragonM>total || dragonN>total || (
                dragonK<1 && dragonL<1 && dragonM<1 && dragonN<1
                )) {
            return 0;
        }
         if(total/dragonK==0 || total/dragonL==0 || total/dragonM==0 || total/dragonN==0){
             return total;
         }
            for (int i = 1; i <= total; i++) {
                if (i % dragonK == 0 || i % dragonL == 0 || i % dragonM == 0 || i % dragonN == 0) {
                    count++;
                }
            }
        return count;
    }
}
import java.util.Scanner;

public class Problem1791B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String moves = sc.next();
            int x = 0, y = 0;
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                char c = moves.charAt(i);
                switch (c) {
                    case 'L':
                        x--;
                        break;
                    case 'R':
                        x++;
                        break;
                    case 'U':
                        y++;
                        break;
                    case 'D':
                        y--;
                        break;
                }
                if(check(x,y)) flag = true;
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
    public static boolean check(int x , int y){
        return x == 1 && y == 1;
    }
}

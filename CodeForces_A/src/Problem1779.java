import java.util.Scanner;

public class Problem1779 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            System.out.println(minDeletionSize(str,n));
        }
    }
    public static int minDeletionSize(String str,int n){
        int r = 0;
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'R') r++;
        }
        if(r == 0 || r == n) return -1;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1) == 'R' && str.charAt(i) == 'L') return 0;
            if(str.charAt(i-1) == 'L' && str.charAt(i) == 'R') return i;
        }
        return -1;
    }
}
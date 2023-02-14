//<a href = "https://codeforces.com/contest/1774/problem/A" />

import java.util.Scanner;

public class Problem1774A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            char[] ch = new char[n-1];
            sc.nextLine();
            String str = sc.nextLine();
            boolean flag = false;
            int count = 0;
            if(str.charAt(0) == '1'){
                count = 1;
            }else {
                count = 0;
            }
            for (int i=1; i<n; i++){
                if(str.charAt(i) == '1'){
                    count++;
                    if(count%2 == 0){
                        ch[i-1] = '-';
                    }else {
                        ch[i-1] = '+';
                    }
                }else {
                    ch[i-1] = '+';
                }
            }
            for (int i=0; i<n-1; i++){
                System.out.print(ch[i]);
            }
            System.out.println();
        }
    }
}

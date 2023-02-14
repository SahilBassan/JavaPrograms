import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/110/A" />
public class Problem110A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int count = 0;
        while (num != 0){
            if(num%10 == 7 || num%10 == 4){
                count++;
            }
            num /= 10;
        }
        if(count==7 || count==4){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}

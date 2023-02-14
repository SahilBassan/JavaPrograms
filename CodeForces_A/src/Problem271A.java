import java.util.Scanner;
//<a href = "https://codeforces.com/contest/271/problem/A" />
public class Problem271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        while(true){
            year++;
            int temp = year;
            int a = temp%10;
            temp /= 10;
            int b = temp%10;
            temp /= 10;
            int c = temp%10;
            temp /= 10;
            int d = temp;
            if(a!=b && a!=c && a!=d & b!=c && b!=d && c!=d){
                break;
            }
        }
        System.out.println(year);
    }
}

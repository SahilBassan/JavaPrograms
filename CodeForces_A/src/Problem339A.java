import java.util.Arrays;
import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/339/A" />
public class Problem339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] splitted = str.split("\\+");
        Arrays.sort(splitted);
        for (int i=0; i<splitted.length; i++){
            System.out.print(splitted[i]);
            if(i< splitted.length-1){
                System.out.print("+");
            }
        }
    }
}
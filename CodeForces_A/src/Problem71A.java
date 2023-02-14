import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/71/A" />

public class Problem71A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i=0; i<testCases; i++){
           String word = scanner.next();
           int n = word.length();
           if(n <= 10){
               System.out.println(word);
           }else{
               System.out.print(word.charAt(0));
               System.out.print(n-2);
               System.out.print(word.charAt(n-1));
               System.out.println();
           }
        }
    }
}

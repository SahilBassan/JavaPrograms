import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/112/A" />

public class Problem112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordOne = sc.nextLine();
        String wordTwo = sc.nextLine();
        int sum = wordOne.compareToIgnoreCase(wordTwo);
        System.out.println(sum);
        if(sum==0){
            System.out.println("0");
        } else if (sum<1) {
            System.out.println("-1");
        }else {
            System.out.println("1");
        }
    }
}


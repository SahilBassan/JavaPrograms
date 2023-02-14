import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/233/A" />
//Problem statement test cases were incomplete
public class Problem233A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 != 0){
            System.out.println("-1");
        }else{
            for(int i=1; i<=num; i++){
                if(i==num){
                    System.out.print(i+ " ");
                }else{
                    System.out.print(i+1 + " " + i + " ");
                }
                i++;
            }
        }
    }
}

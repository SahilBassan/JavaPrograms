import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        recursion(1,n);
    }
    public static void recursion(int s, int l){
        if(s>l) return;
        System.out.println(s);
        recursion(s+1,l);
    }
}

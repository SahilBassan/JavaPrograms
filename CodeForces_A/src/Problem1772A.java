import java.util.Scanner;

public class Problem1772A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String str = sc.nextLine();
            int a = 0;
            for (int i=0; i<str.length(); i+=2){
                a += Character.getNumericValue(str.charAt(i));
            }
            System.out.println(a);
        }
    }
}

import java.util.Scanner;

public class Problem1795A {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int  t = sc.nextInt();
        while (t-->0){
            System.out.println(solver());
        }
    }
    public static String solver(){
        int n = sc.nextInt();
        int m = sc.nextInt(); sc.nextLine();
        String a = sc.nextLine();
        String b = sc.nextLine();
        int count = 0;
        char[]  charArr = b.toCharArray();
        StringBuilder nStr = new StringBuilder();
        for (int i=0; i<charArr.length; i++)
        {
            nStr.insert(0, charArr[i]);
        }
        a += nStr.toString();
        //System.out.println(a);
        for(int i=1; i<n+m; i++){
            if(a.charAt(i) == a.charAt(i-1)){
                count++;
            }
        }
        if(count>=2) return "NO";
        return "YES";
    }
}

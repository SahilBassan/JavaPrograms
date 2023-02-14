import java.util.*;

public class Problem1762B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int len = sc.nextInt();
            int[] arr = new int[len];
            int[][] mat = new int[len][2];
            int size = 0;
            for(int i=0; i<len; i++){
                arr[i] = sc.nextInt();
                mat[i][0] = arr[i];
                mat[i][1] = i;
            }

        }
    }
}
//        3
//        2 1
//        3 3
//        4 3
//        0
//        3
//        2 2
//        4 1
//        3 5
//        2
//        3 3
//        1 9
import java.util.Arrays;
import java.util.Scanner;
//<a href = "https://codeforces.com/contest/1774/problem/A" />

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        String str = new String();
//        char ch = sc.next().charAt(0);
//        String word = sc.next();

////        Code Snippets for Matrix

//        int[][] mat = new int[3][3];
//        int n = mat.length;
//        int m = mat[0].length;

        int[][] matrix = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
//        Matrix input
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
//        Sorting rows of matrix
        for (int i=0; i<n; i++){
            Arrays.sort(matrix[i]);
        }

//        Printing matrix
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}

//    private static int solver(int n){
//        if( n < 0){
//            return 0;
//        } else if (n < 11) {
//            return n;
//        } else if (n > 10 && n <= 100) {
//            System.out.println(9 + n/10);
//        } else if (n>100 && n <=1000) {
//            System.out.println(18 + (n/100));
//        } else if (n > 1000 && n <= 10_000) {
//            int rem = n%1000;
//            int div = n/1000;
////            System.out.println( solver(rem) + (div * ));
//        }
//    }

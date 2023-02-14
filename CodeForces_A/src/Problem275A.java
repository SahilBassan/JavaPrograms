import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/275/A" />

public class Problem275A {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[][] matrix = new int[3][3];
        int[][] mat = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
//        Taking Matrix input
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
                mat[i][j] = 1;
            }
        }
//        calling change function if that position is pressed odd number of times
//        Because If button pressed even number of times make light unchanged
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if(matrix[i][j]%2 != 0){
                    change(mat,i,j);
                }
            }
        }
//        Printing resulted matrix
        for (int[] ints : mat) {
            for (int j = 0; j < m; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
    }
//    Function to change position 1 to 0 and 0 to 1
    static int[][] change (int[][] mat , int r , int c){
//        Changing the state of that light and adjacent lights
//            making all possible condition state change
            mat[r][c] = 1 ^ mat[r][c];
            if(r-1 >= 0) {
                mat[r - 1][c] = 1 ^ mat[r - 1][c];
            }
//             or one more approach we use instead of xor to change state it to minus current number from 1
//             mat[r-1][c] = 1 - mat[r-1][c]; it will also make 1 as 0 and 0 as 1
            if(r+1 <= 2){
                mat[r+1][c] = 1 ^ mat[r+1][c];
            }
            if(c-1 >= 0){
                mat[r][c-1] = 1 ^ mat[r][c-1];
            }
            if(c+1 <= 2){
                mat[r][c+1] = 1 ^ mat[r][c+1];
            }
        return mat;
    }
}

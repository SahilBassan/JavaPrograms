import java.util.Scanner;

public class Problem1772B {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-->0){
            System.out.println(isBeautiful());
        }
    }
    private static String isBeautiful(){
            int[][] mat = new int[2][2];
            for (int i=0; i<2; i++){
                for (int j=0; j<2; j++){
                    mat[i][j] = sc.nextInt();
                }
            }
            for (int i=0; i<4; i++){
                if(isBeautifulCheck(mat)){
                    return "YES";
                }else {
                    rotate(mat);
                }
            }
        return "NO";
    }
    public static boolean isBeautifulCheck(int[][] mat){
            if((mat[0][0] < mat[0][1]) && (mat[1][0] < mat[1][1])){
                if((mat[0][0] < mat[1][0]) && (mat[0][1] < mat[1][1])){
                    return true;
                }
            }
        return false;
    }
    public static int[][] rotate(int[][] mat){
        int[][] check = mat;
        int m = check.length;
//             First transposing the matrix
        for(int col=0; col<m; col++){
            for(int row=1+col; row<m; row++){
                int temp = check[row][col];
                check[row][col] = check[col][row];
                check[col][row] = temp;
            }
        }

//             Now swapping coloumns like said in start
        for(int col_1 = 0 , col_2=m-1; col_1<m/2; col_1++,col_2--){
            for(int row= 0; row<m; row++){
                int temp = check[row][col_1];
                check[row][col_1] = check[row][col_2];
                check[row][col_2] = temp;;
            }
        }
        return check;
    }
}


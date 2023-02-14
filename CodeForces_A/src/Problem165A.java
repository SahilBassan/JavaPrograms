import java.util.Scanner;

public class Problem165A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] mat = new int[num][2];
        for (int i=0; i<num; i++){
            for (int j=0; j<2; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int result = 0;
        for(int row=0; row<num; row++){
            int a = mat[row][0];
            int b = mat[row][1];
            int count = 0;
            boolean flag1 = true,flag2 = true,flag3 = true,flag4 = true;
            for (int i=0; i<num; i++){
                    if(a > mat[i][0] && b == mat[i][1] && flag1){
                        flag1 = false;
                        count++;
                        continue;
                    }
                    if( a < mat[i][0] && b == mat[i][1] && flag2){
                        flag2 = false;
                        count++;
                        continue;
                    }
                    if( a == mat[i][0] && b < mat[i][1] && flag3){
                        flag3 = false;
                        count++;
                        continue;
                    }
                    if( a == mat[i][0] && b > mat[i][1] && flag4){
                        flag4 = false;
                        count++;
                    }
            }
            if(count >= 4){
                result++;
            }
        }
        System.out.println(result);
    }
}

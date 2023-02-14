import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/248/A" />

public class Problem248A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[][] matrix = new int[total][2];
        int time = 0;
        int colSum1 = 0;
        int colSum2 = 0;
        for(int i=0; i<total; i++){
            for(int j=0; j<2; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<total; i++){
            colSum1 += matrix[i][0];
        }
        for(int i=0; i<total; i++){
            colSum2 += matrix[i][1];
        }

        time +=Math.min(colSum1, total-colSum1);
        time +=Math.min(colSum2, total-colSum2);
        System.out.println(time);
    }
}

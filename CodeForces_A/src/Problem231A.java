import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/231/A" />

public class Problem231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfProblems = sc.nextInt();
        int numberOfFriends = 3;
        int[][] matrix = new int[numberOfProblems][numberOfFriends];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            int sum =0;
            for (int j=0; j<m; j++){
                sum += matrix[i][j];
            }
            if(sum > 1){
                count++;
            }
        }
        System.out.println(count);
    }
}

import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/228/A" />

public class Problem228A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] color = new int[4];
        for(int i=0; i<4; i++){
            color[i] = sc.nextInt();
        }
        int count = 0;
        if(color[0] == color[1] || color[0] == color[2] || color[0] == color[3]){
            count++;
        }
        if(color[1] == color[2] || color[1] == color[3]){
             count++;
        }
        if(color[2] == color[3]){
            count++;
        }
        System.out.println(count);
    }
}

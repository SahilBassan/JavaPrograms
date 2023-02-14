import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/116/A" />
public class Problem116A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] exit = new int[num];
        int[] entry = new int[num];
        int sum = 0;
        int highest = 0;
        for(int i=0; i<num; i++){
            exit[i] = sc.nextInt();
            entry[i] = sc.nextInt();
            sum += entry[i]-exit[i];
            if(sum > highest){
                highest = sum;
            }
        }
        System.out.println(highest);
    }
}


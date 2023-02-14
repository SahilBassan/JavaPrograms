import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/155/A" />
public class Problem155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int count = 0;
        arr[0] = sc.nextInt();
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<num; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < min){
                count++;
                min = arr[i];
            }
            if(arr[i] > max){
                count++;
                max = arr[i];
            }
        }
        System.out.println(count);
    }
}

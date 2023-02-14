import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/266/B" />

public class Problem266B {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int number = sc.nextInt();
        int time = sc.nextInt();
        String position = sc.next();
        char[] arr = position.toCharArray();
        for(int i=0; i<time; i++){
            for(int j=0; j<number ; j++){
                if(j < number-1 && arr[j] == 'B' && arr[j+1] == 'G'){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    j++;
                }
            }
        }
        System.out.println(arr);
    }
}
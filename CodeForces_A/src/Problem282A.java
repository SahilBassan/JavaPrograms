import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/282/A" />

public class Problem282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        String[] arr = new String[numberOfTestCases];
        for(int i=0 ; i< arr.length; i++){
            arr[i] = sc.next();
        }
        float count = 0;
        for(int i=0 ; i< arr.length; i++){
            for (int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j) == '+'){
                    count += 0.5;
                }
                if(arr[i].charAt(j) == '-'){
                    count -= 0.5;
                }
            }
        }
        System.out.println((int) count);
    }
}

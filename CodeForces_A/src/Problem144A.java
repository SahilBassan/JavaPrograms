import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/144/A" />

public class Problem144A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num+1];
        int n = arr.length;
        arr[0] = 0;
        for(int i=1; i < n; i++){
            arr[i] =  sc.nextInt();
        }
        int highIndex = 0;
        int lowIndex = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=1; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
                highIndex = i;
            }
            if(arr[i] <= smallest){
                smallest = arr[i];
                lowIndex = i;
            }
        }
        if (lowIndex<highIndex){
            System.out.println(((highIndex-1)+(n-1-lowIndex))-1);
        }else {
            System.out.println((highIndex-1)+(n-1-lowIndex));
        }
    }
}

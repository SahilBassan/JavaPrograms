// printing all the subArrays of an array without recursion

//to do
//subsequence of string
//subString of string
import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter length of array ; ");
        int n = sc.nextInt();

        System.out.println("Enter all the elements of array separated by space :");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                for (int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

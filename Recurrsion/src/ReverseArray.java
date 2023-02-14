import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int  n = sc.nextInt();

        System.out.println("Enter elements of array");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(reverseArray(arr,0,n-1)));
    }

    //using functional approach
    public static int[] reverseArray(int[] arr, int l, int r){
        if(l>=r) return arr;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArray(arr,l+1,r-1);
        return arr;
    }
}

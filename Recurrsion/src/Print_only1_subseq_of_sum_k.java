/* most important pattern
what if we want to stop recursion when we get one answer, but we don't want
more answers only one, so we need to stop recursion at that point
but not allowed to use flag variable*/

import java.util.ArrayList;
import java.util.Scanner;

public class Print_only1_subseq_of_sum_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array ; ");
        int n = sc.nextInt();

        System.out.println("Enter all the elements of array separated by space :");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number k :");
        int k = sc.nextInt();
        subSequenceOfArray(new ArrayList<Integer>(),0, arr, n, 0, k);
    }

    //note function will return boolean this time
    public static boolean subSequenceOfArray(ArrayList<Integer> arrl, int index, int[] arr, int n, int sum, int k){
        if(index == n){
            if(sum == k){
                System.out.println(arrl);
                return true;
            }
            return false;
        }

        //pick
        arrl.add(arr[index]);
        //sum += arr[index];
        //in case we get true means we found one no need to recurse more
        if(subSequenceOfArray(arrl, index+1, arr, n, sum + arr[index], k)){
            return true;
        }
        //not pick
        arrl.remove(arrl.size() - 1);
        //sum -= arr[index];

        //in case we get true means we found one no need to recurse more
        if(subSequenceOfArray(arrl, index+1, arr, n, sum, k)){
            return true;
        }

        return false;
    }
}




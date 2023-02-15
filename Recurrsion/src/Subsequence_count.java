import java.util.*;
/*
most important pattern
What if we need to get sum of all the subsequence
we can carry one count variable with us but that is not suggested
we can return count from function only
in this case we don't need to carry any data structure like arraylist
Note this time method will return int
*/

public class Subsequence_count {
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

        System.out.println("Number of sub-sequence of sum " + k + " is :");
        System.out.println(subSequenceOfArray(0, arr, n, 0, k));

        System.out.println("all possible sub-sequence in given array are : ");
        System.out.println(subSequenceOfArray(0, arr, n));
    }

    //method to return only count of subsequence till k
    public static int subSequenceOfArray(int index, int[] arr, int n, int sum, int k){
        //base case
        if(index == n){
            if(sum == k){
                return 1;
            }
           return 0;
        }

        //pick
        sum += arr[index];
        int l = subSequenceOfArray(index+1, arr, n, sum, k);

        //not pick
        sum -= arr[index];
        int r = subSequenceOfArray(index+1, arr, n, sum, k);

        return l+r;
    }

    //method to return all possible subsequence
    public static int subSequenceOfArray(int index, int[] arr, int n){
        //base case
        if(index == n){
            return 1;
        }

        //pick
        int l = subSequenceOfArray(index+1, arr, n);

        //not pick
        int r = subSequenceOfArray(index+1, arr, n);

        return l+r;
    }

/*
if in case u don't want to print only the count of subsequence till k
but u want to get the count of all the subsequence possible just remove sum and return only 1 in base case
*/
}

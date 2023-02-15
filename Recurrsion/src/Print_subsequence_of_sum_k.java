import java.util.*;
//most important pattern
///printing only those sub-sequence whose sum is k

public class Print_subsequence_of_sum_k {
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
    private static void subSequenceOfArray(ArrayList<Integer> arrl, int index , int[] arr, int n, int sum, int k){
        if(index == n){
            if(sum == k){
                System.out.println(arrl);
            }
            return;
        }

        //pick
        arrl.add(arr[index]);
        sum += arr[index];
        subSequenceOfArray(arrl, index + 1, arr, n, sum, k);

        //not pick
        arrl.remove(arrl.size() - 1);
        sum -= arr[index];
        subSequenceOfArray(arrl, index + 1, arr, n, sum, k);
    }
}

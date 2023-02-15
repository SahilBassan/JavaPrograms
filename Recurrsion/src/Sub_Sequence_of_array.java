//most important pattern

import java.util.*;

public class Sub_Sequence_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array ; ");
        int n = sc.nextInt();

        System.out.println("Enter all the elements of array separated by space :");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        subSequenceOfArray(new ArrayList<>(),0, arr, n);
    }

    public static void subSequenceOfArray(ArrayList<Integer> arrl, int index, int[] arr, int n){
        //base case
        if(index == n){
            System.out.println(arrl);
            return;
        }

        //Select side of tree first
        arrl.add(arr[index]);
        subSequenceOfArray(arrl, index+1, arr, n);

        arrl.remove(arrl.size() - 1);
        subSequenceOfArray(arrl, index+1, arr, n);

        // Not select side of tree first
//        subSequenceOfArray(arrl, index+1, arr, n);
//
//        arrl.add(arr[index]);
//        subSequenceOfArray(arrl, index+1, arr, n);
//
//        arrl.remove(arrl.size() - 1);
    }
}

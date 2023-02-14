//20 March 2021 9 AM

import java.util.Arrays;
import java.util.Scanner;

public class NthGreatestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int nth = sc.nextInt();
        System.out.println(arr[n-nth]);
    }
}

//Take array and print the nth largest element of array
// Example arr is 7 length
//  10
//  30
//  20
//  50
//  40
//  70
//  60
// we need to get 4th largest element
//  4
// 4th largest element is 40
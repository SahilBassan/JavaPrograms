// printing all the subArrays of an array without recursion

//to do
//subsequence of string
//subString of string

public class Subarray {
    public static void main(String[] args) {
        System.out.println(compute(new int[]{5, 6, 6, 8},4,4));
    }
    public static int compute(int[] input1 , int input2,int input3){
        int n = input2;
        int[] arr = input1;
        int low = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<=input3; j++){
                sum += arr[j];
            }
            low = Math.min(sum, low);
        }

        return low;
    }
}

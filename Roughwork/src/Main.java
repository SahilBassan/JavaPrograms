import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int t = 7;
        List<List<Integer>> arrl2 = combinationSum(arr,t);
        for (List<Integer> integers : arrl2) {
            System.out.println(integers);
        }
    }
    public static List<List<Integer>> combinationSum (int[] candidates, int target){
        List<List<Integer>> arrl2 = new ArrayList<>();
        subSequence(new ArrayList<Integer>(), arrl2, candidates, 0, candidates.length, 0, target);
        return arrl2;
    }

    private static void subSequence (List < Integer > arrl, List < List < Integer >> arrl2,
                                     int[] arr, int index, int n, int sum, int target){
        //base case
        if (n == index) {
            if (sum == target) arrl2.add(new ArrayList<>(arrl));
            return;
        }

        //pick
        arrl.add(arr[index]);
        sum += arr[index];
        if (sum == target) arrl2.add(arrl);
        if (sum < target) {
            subSequence(arrl, arrl2, arr, index, n, sum, target);
        }

        arrl.remove(arrl.size() - 1);
        sum -= arr[index];
        subSequence(arrl, arrl2, arr, index + 1, n, sum, target);
    }
}

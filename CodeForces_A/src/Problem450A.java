import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/450/A" />

public class Problem450A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int candies = sc.nextInt();
        int element = 1;
        List<Integer> ls = new ArrayList<>();
        for(int i=0; i<num; i++){
            ls.add(element);
            element++;
        }
        int[] arr = new int[num];
        int count = 0;
        for (int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]<=candies){
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
        for (int i=0; i<count; i++){
            ls.remove(i);
        }
        System.out.println(ls);
//        System.out.println(res);
    }
}
//    Scanner sc = new Scanner(System.in);
//    int num = sc.nextInt();
//    int candies = sc.nextInt();
//
//    int[] distribution = new int[num];
//    int index = -1;
//        for (int i=0; i<num; i++){
//        distribution[i] = sc.nextInt();
//        if(distribution[i] > candies){
//            index = i;
//        }
//    }
//
//    ArrayList<Integer> child = new ArrayList<>(num);
//    int fillIntegers =1;
//        for (int i=0; i<num; i++){
//        child.add(fillIntegers);
//        fillIntegers++;
//    }
//        System.out.println(solve(num,candies,index,distribution,child));
//}
//    //    Main solving function
//    private static int solve(int num, int candies, int index, int[] distribution, ArrayList<Integer> arrayList){
//        ArrayList<Integer> child = arrayList;
//        int size = child.size();
//        int answer = child.get(size-1);
//        if(index > child.size()){
//            return answer;
//        }else {
//            child = removeTillDefault(child,index);
//        }
//        return solve(num,candies,index,distribution,child);
//    }
//    //    Function to remove elements from ArrayList till where distribution of candy follow rules
//    private static ArrayList<Integer> removeTillDefault(ArrayList<Integer> arrl, int index){
//        ArrayList<Integer> child = arrl;
//        for (int i=0; i<index; i++){
//            child.remove(i);
//        }
//        return child;

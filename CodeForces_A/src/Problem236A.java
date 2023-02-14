import java.util.HashSet;
import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/236/A" />

public class Problem236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n = word.length();
        char[] arr = word.toCharArray();
        removeDuplicate(arr,n);
    }
//    Function to remove duplicate from string
    static void removeDuplicate(char[] charArray,int n){
        HashSet<Character> charSet = new HashSet<>();
//        HashSet don't allow duplicate items
        for (int i=0; i<n; i++){
            charSet.add(charArray[i]);
        }
        if(charSet.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }
    }
}

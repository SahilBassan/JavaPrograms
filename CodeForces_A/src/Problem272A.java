import java.util.*;
//<a href = "https://codeforces.com/problemset/problem/272/A" />

public class Problem272A {
    public static void main(String[] args) {
        System.out.println(solve());
    }
    static int solve(){
        Scanner sc = new Scanner(System.in);
        int numberOfFriends = sc.nextInt();
        int total = numberOfFriends+1; //including dima
        int[] numberOfFingers = new int[numberOfFriends];
        for (int i=0; i<numberOfFriends; i++){
            numberOfFingers[i] = sc.nextInt();
        }
        int sumOfFingers = 0;
        for (int i = 0; i < numberOfFriends; i++) {
            sumOfFingers += numberOfFingers[i];
        }
        int remainder = sumOfFingers%total;
        int answer = 0;
            for (int i=0; i<5; i++){
                remainder++;
                if(remainder>total) remainder = 1;
                if(remainder==1) answer++;
            }
        return 5-answer;
    }
}


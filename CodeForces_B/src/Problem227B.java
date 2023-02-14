import java.util.Scanner;

//<a href = "https://codeforces.com/problemset/problem/227/B" />
public class Problem227B {
    public static void main(String[] args) {
        solve();
    }
        private static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pos = new int[n+1];
        for(int i=1; i<n+1; i++){
            pos[sc.nextInt()] = i;
        }
        int m = sc.nextInt();
        int q;
        long vasya = 0;
        long petya = 0;
        for(int i=0; i<m; i++){
            q = sc.nextInt();
            vasya += pos[q];
            petya += n - pos[q] + 1;
        }
        System.out.println(vasya+" "+petya);
    }
}
//        10
//        3 10 9 2 7 6 5 8 4 1
//        1
//        4


////        My solution time limit exceed on test case 7
//Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int[] arr = new int[n+1];
//        for (int i=1; i<n+1; i++){
//        arr[i] = sc.nextInt();
//        }
//        int queries = sc.nextInt();
//        int[] query = new int[queries+1];
//        for (int i=1; i<queries+1; i++){
//        query[i] = sc.nextInt();
//        }
//        arr[0] = 0;
//        query[0] = 0;
//        long vasya = 0;
//        long petya = 0;
//        for (int i=1; i<queries+1; i++){
////            int counter = 0;
//        for (int j=1; j<n+1; j++){
////                counter++;
//        if(arr[j] == query[i]){
//        vasya += j;
//        petya += (n-j)+1;
//        break;
//        }
//        }
//        }
// System.out.println(vasya + " " + petya);
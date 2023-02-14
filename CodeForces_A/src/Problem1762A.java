import java.util.Scanner;
//<a href = "https://www.youtube.com/watch?v=MDWhxPG_N6w" />
//<a href = "https://www.youtube.com/watch?v=MDWhxPG_N6w" />
public class Problem1762A {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-->0){
            System.out.println(solve());
        }
    }
    public static int solve(){
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        int answer = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        if(sum%2 == 0){
            return 0;
        }else {
            for (int i=0; i<n; i++){
                int num = arr[i];
                int operations = 0;
                while ((num%2) == (arr[i]%2)){
                    num /= 2;
                    operations++;
                }
                answer = Math.min(operations, answer);
            }
        }
        return answer;
    }
}

//    public static int solve(){
//            int even = 0;
//            int minOdd = Integer.MAX_VALUE;
//            int minEven = Integer.MAX_VALUE;
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            int sum = 0;
//            int answer = 0;
//            for(int i=0; i<n; i++){
//                arr[i] = sc.nextInt();
//                sum += arr[i];
//                if(arr[i] % 2 == 0){
//                    even++;
//                    minEven = Math.min(minEven, arr[i]);
//                }else {
//                    minOdd = Math.min(minOdd, arr[i]);
//                }
//            }
//            if(sum%2 == 0) {
//                return 0;
//            }else {
//                    if(even == 0){
//                        while (minOdd%2 != 0){
//                            minOdd /= 2;
//                            answer++;
//                        }
//                        return answer;
//                    }else {
//                        int count1 = 0;
//                        int count2 = 0;
//                        while (minEven%2 == 0){
//                            minEven /= 2;
//                            count1++;
//                        }
//                        System.out.println(count1);
//                        while (minOdd%2 != 0){
//                            minOdd /= 2;
//                            count2++;
//                        }
//                        System.out.println(count2);
//                        answer = Math.min(count1,count2);
//                    }
//            }
//            return answer;
//    }
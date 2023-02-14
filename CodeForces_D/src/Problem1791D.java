import java.util.*;

public class Problem1791D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            HashSet<Character> hs = new HashSet<>();
            int n = sc.nextInt(); sc.nextLine();
            String str = sc.nextLine();
            int[] suffix = new int[n];
            int[] prefix = new int[n];
            int answer = 0;
            for (int i=0; i<n; i++){
                hs.add(str.charAt(i));
                suffix[i] = hs.size();
            }
            hs.clear();
            for (int i=n-1; i>-1; i--){
                hs.add(str.charAt(i));
                prefix[i] = hs.size();
            }
            for (int i=0; i<n-1; i++){
                int sum = suffix[i] + prefix[i+1];
                answer = Math.max(answer,sum);
            }
            System.out.println(answer);
        }
    }
}

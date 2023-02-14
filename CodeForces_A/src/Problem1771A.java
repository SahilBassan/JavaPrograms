import java.util.Scanner;

public class Problem1771A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
            int minCount = 0;
            int max = Integer.MIN_VALUE;
            int maxCount = 0;
            for (int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] <= min && arr[i] != max){
                    if(arr[i] < min){
                        min = arr[i];
                        minCount = 1;
                        continue;
                    }
                    if(arr[i] == min){
                        minCount++;
                    }
                }
                if(arr[i] >= max && arr[i] != min){
                    if(arr[i] > max){
                        max = arr[i];
                        maxCount = 1;
                        continue;
                    }
                    if(arr[i] == max){
                        maxCount++;
                    }
                }
            }
            if(max == min){
                System.out.println("0");
            }else {
                System.out.println((minCount*maxCount)*2);
            }
        }
    }
}

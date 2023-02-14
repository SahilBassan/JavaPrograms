import java.util.Scanner;

public class Problem1776 {


    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            int n = sc.nextInt();
            String s = Integer.toString(n);
            int k = 1;
            int len = s.length();
            // Function call
            System.out.println(k_nonzero_numbers(s, len, k));
        }
    }

        // Function to find number less than N
// having k non-zero digits
        static int k_nonzero_numbers(String s, int n, int k)
        {

            // Store the memorised values
            int dp[][][] = new int[n + 1][2][k + 1];

            // Initialise
            for(int i = 0; i <= n; i++)
                for(int j = 0; j < 2; j++)
                    for(int x = 0; x <= k; x++)
                        dp[i][j][x] = 0;

            // Base
            dp[0][0][0] = 1;

            // Calculate all states
            // For every state, from numbers 1 to N,
            // the count of numbers which contain exactly j
            // non zero digits is being computed and updated
            // in the dp array.
            for(int i = 0; i < n; ++i)
            {
                int sm = 0;
                while (sm < 2)
                {
                    for(int j = 0; j < k + 1; ++j)
                    {
                        int x = 0;
                        while (x <= (sm !=
                                0 ? 9 :s.charAt(i) - '0'))
                        {
                            if (j + (x > 0 ? 1 : 0) < k + 1)
                            {
                                dp[i + 1][(sm != 0 || x <
                                        (s.charAt(i) - '0')) ?
                                        1 : 0][j + (x > 0 ?
                                        1 : 0)] += dp[i][sm][j];
                            }
                            ++x;
                        }
                    }
                    ++sm;
                }
            }

            // Return the required answer
            return dp[n][0][k] + dp[n][1][k];
        }
    }

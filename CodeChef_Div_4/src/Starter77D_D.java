
import java.util.*;

public class Starter77D_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            List<Integer> v = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                v.add(sc.nextInt());
            }

            if (k % 2 == 1) {
                System.out.println("YES");
                continue;
            }

            PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
            int l = 0, r = v.size() - 1;
            while (l <= r) {
                q.add(Math.abs(v.get(l) - v.get(r)));
                l++;
                r--;
            }

            while (!q.isEmpty()) {
                int x = q.peek();
                if (x == 0) {
                    if (k > 2) {
                        k -= 2;
                    }
                    q.poll();
                    continue;
                } else {
                    int d = (int)k;
                    List<Integer> tmp = new ArrayList<>();
                    if (q.size() <= k)
                        break;
                    while (d-- > 0) {
                        tmp.add(q.poll());
                    }

                    for (int i = 0; i < tmp.size(); i++) {
                        q.add(tmp.get(i) - x);
                    }
                }

                if (q.size() == 2 && k == 2) {
                    break;
                }
            }

            if (q.size() > 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}

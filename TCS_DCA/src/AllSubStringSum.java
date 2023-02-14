//20 march 2021 1 PM

import java.util.Scanner;

public class AllSubStringSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            for (int j=i+1; j<=str.length(); j++){
                //System.out.println(str.substring(i,j));
                sum += Integer.parseInt(str.substring(i,j));
            }
        }
        System.out.println(sum);
    }
}
//Given Integer String give sum of all the sub strings
//Note in substring method first index is inclusive but second is exclusive
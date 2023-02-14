//20 March 2021 9 AM

import java.util.Scanner;

public class CheckLastIsSameOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long answer = (int) Math.pow(n,4);
        System.out.println(answer);
        if(answer%10 != n){
            System.out.println("False");
        }else {
            System.out.println("True");
        }
    }
}
//Take a number input
//Get the sum of number power 4
//and if the last digit of this number is equal to number
//return true else false
//1 <= N <= 10^8
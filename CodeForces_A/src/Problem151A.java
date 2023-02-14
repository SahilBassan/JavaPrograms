import java.util.Scanner;
//<a href = "https://codeforces.com/problemset/problem/151/A" />

public class Problem151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPerson = sc.nextInt();
        int bottles = sc.nextInt();
        int litres = sc.nextInt();
        int limes = sc.nextInt();
        int sliceCut = sc.nextInt();
        int saltInGram = sc.nextInt();
        int mlOfdrinkNeededPerToast = sc.nextInt();
        int saltNeededPerToast = sc.nextInt();

        int noOfToastCanBeMadeWithTotalDrinks = (bottles*litres)/mlOfdrinkNeededPerToast;
        int noOfToastCanBeMadeWithTotalLime = limes*sliceCut;
        int noOfToastCanBeMadeWithTotalSalt = saltInGram/saltNeededPerToast;

        int result = Math.min(noOfToastCanBeMadeWithTotalSalt,
                Math.min(noOfToastCanBeMadeWithTotalDrinks,
                        noOfToastCanBeMadeWithTotalLime))/numberOfPerson;
        System.out.println(result);
    }
}
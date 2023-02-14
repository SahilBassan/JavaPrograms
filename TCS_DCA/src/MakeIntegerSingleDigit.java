import java.util.Scanner;

public class MakeIntegerSingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = intSum(n);
        //System.out.println(answer);
        while (answer>9){
            answer = intSum(answer);
            //System.out.println(answer);
        }

        System.out.println(answer == 1? "UNO" : "Not UNO");
    }
    public static int intSum(int n){
        int sum = 0;
        while (n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
//Make an integer single digit by adding its digit until it becomes single digit
//if it is one print uno else not uno
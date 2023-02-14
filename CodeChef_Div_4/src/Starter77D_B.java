import java.util.Scanner;

public class Starter77D_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-->0){
            int capacityPerPlane = sc.nextInt();
            int customer = sc.nextInt();
            int price = sc.nextInt();
            int totalCapacity = capacityPerPlane*10;
            if(customer<=totalCapacity){
                System.out.println(price * customer);
            }else {
                System.out.println(price * totalCapacity);
            }
        }
    }
}

import java.util.Scanner;

public class Problem1774C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int hello = sc.nextInt();
            sc.nextLine();
            String byr = sc.nextLine();
            char fregf = byr.charAt(0);
            int frgt = 1;
            int freet = 1;

            for(int i=0; i<byr.length(); i++){
                freet++;
                if(fregf == 'i'){
                    System.out.print(frgt + " ");
                }else {
                    frgt = freet-1;
                    fregf = 'i';
                    System.out.print(frgt + " ");
                }
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class JetPlane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x = 0;
        int y = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'E'){
                x--;
            } else if (str.charAt(i) == 'W') {
                x++;
            } else if (str.charAt(i) == 'N') {
                y++;
            }else {
                y--;
            }
        }
        if(x==0 && y==0){
            System.out.println("returned");
        }else {
            System.out.println("not");
        }
    }
}

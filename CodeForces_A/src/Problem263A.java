import java.util.Scanner;
//<a href = "https://codeforces.com/contest/263/problem/A" />
public class Problem263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowLoc = 0;
        int colLoc = 0;
        for(int i=1; i<6; i++){
            for (int j=1; j<6; j++) {
                int num = sc.nextInt();
                if (num == 1) {
                    rowLoc = i;
                    colLoc = j;
                }
            }
        }
        int move;
        if((rowLoc<3 && colLoc<3) || (rowLoc<3 && colLoc==3) || ((rowLoc==3 && colLoc<3))){
            move = (3-rowLoc) + (3-colLoc);
        }else if((rowLoc>3 && colLoc>3) || (rowLoc>3 && colLoc==3) || ((rowLoc==3 && colLoc>3)) ){
            move = (rowLoc-3) + (colLoc-3);
        }else if (rowLoc<3 && colLoc>3) {
            move = (3-rowLoc) + (colLoc-3);
        }else if (rowLoc>3 && colLoc<3){
            move =(rowLoc-3) + (3-colLoc);
        }else {
            move = 0;
        }
        System.out.println(move);
    }
}

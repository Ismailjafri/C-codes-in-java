package Loop_Pattern;

import java.util.*;

public class Q15 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Size Of The Pattern: ");
        int a = input.nextInt();

        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <= a-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1 ; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

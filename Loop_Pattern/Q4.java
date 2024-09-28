package Loop_Pattern;

import java.util.*;

public class Q4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Size Of The Pattern: ");
        int a = input.nextInt();

        for (int i = a; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

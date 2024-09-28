package Loop_Pattern;

import java.util.*;

public class Q11 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Size Of The Pattern: ");
        int a = input.nextInt();

        for (int i = 1; i <= a ; i++) {
            if(i<=a/2+1){
                for (int s = 1; s <= a-i ; s++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i ; j++) {
                    System.out.print("*");
                }
            }
            else{
                for (int s = a-i; s >= 1 ; s--) {
                    System.out.print(" ");
                }

                for (int j = a; j >= i  ; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

package Loop_Advance;

import java.util.Scanner;

public class Q11_i {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Size Of Pattern: ");
        int a = input.nextInt();

        for (int i = 1; i <= a ; i++) {
            if(i==1 || i==a){
                for (int j = 1; j <= a ; j++) {
                    System.out.print("* ");
                }
            }

            else{
                for (int j = 1; j <= 2*a-1 ; j++) {
                    if(j==1 || j==2*a-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

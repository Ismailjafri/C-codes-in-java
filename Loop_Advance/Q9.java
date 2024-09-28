package Loop_Advance;

import java.util.Scanner;

public class Q9 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Starting Point: ");
        int sp = input.nextInt();

        System.out.print("Enter Ending Point: ");
        int ep = input.nextInt();

        while(sp<=ep){
            int sum = 0;
            for (int i = sp; i > 0 ; i/=10) {
                int fact = 1;
                int ld = i%10;
                for (int j = 1; j <= ld; j++) {
                    fact = fact*j;
                }
                sum = sum + fact;
            }
            if(sum==sp){
                System.out.println(sp);
            }
            sp++;
        }


    }
}

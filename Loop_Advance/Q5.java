package Loop_Advance;

import java.util.Scanner;

public class Q5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Starting Point: ");
        int sp = input.nextInt();

        System.out.print("Enter Ending Point: ");
        int ep = input.nextInt();

        while(sp<=ep){
            int count = 0;
            for (int i = 2; i < sp; i++) {
                if(sp%i==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(sp);
            }
            sp++;
        }

    }
}

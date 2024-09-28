package Loop_Advance;

import java.util.Scanner;

public class Q7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Starting Point: ");
        int sp = input.nextInt();

        System.out.print("Enter Ending Point: ");
        int ep = input.nextInt();

        while(sp<=ep){
            int reverseNo = 0;
            for (int i = sp; i > 0 ; i/=10) {
                int ld = i%10;
                reverseNo = reverseNo*10 + ld;
            }

            if(sp==reverseNo){
                System.out.println(sp);
            }
            sp++;
        }

    }
}

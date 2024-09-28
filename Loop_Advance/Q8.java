package Loop_Advance;

import java.util.Scanner;

public class Q8 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Starting Point: ");
        int sp = input.nextInt();

        System.out.print("Enter Ending Point: ");
        int ep = input.nextInt();

        while(sp<=ep){
            int count = 0;
            for (int c = sp; c > 0 ; c/=10) {
                count++;
            }

            int sum=0;
            for (int i = sp; i > 0 ; i/=10) {
                int ld = i%10;
                int base = ld;
                for (int j = count; j > 1 ; j--) {
                    base = base*ld;
                }
                sum = sum + base;
            }

            if(sum==sp){
                System.out.println(sp);
            }
            sp++;
        }

    }
}

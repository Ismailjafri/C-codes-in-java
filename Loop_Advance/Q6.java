package Loop_Advance;

import java.util.Scanner;

public class Q6 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Starting Point: ");
        int sp = input.nextInt();

        System.out.print("Enter Ending Point: ");
        int ep = input.nextInt();
        int f1 = 0;
        int f2 = 1;
        int next = 0;

        while(next<=ep){
           if(next>=sp){
               System.out.print(next);
           }
           f1 = f2;
           f2 = next;
           next = f1 + f2;
        }

    }
}

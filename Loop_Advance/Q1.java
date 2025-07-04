package Loop_Advance;

import java.util.Scanner;

public class Q1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Starting Point Now: ");
        int sp = input.nextInt();

        System.out.print("Enter Ending Point: ");
        int ep = input.nextInt();

        while(sp<=ep){
            if(sp%2==0){
                System.out.print("Coding ");
            }
            else{
                System.out.print("Age ");
            }
            sp++;
        }

    }
}

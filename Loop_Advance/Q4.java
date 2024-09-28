package Loop_Advance;

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int a = input.nextInt();

        int ld = a%10;
        System.out.printf("The Last Digit Is %d\n",ld);

        while(a>0){
            ld = a%10;
            a/=10;
        }

        System.out.printf("The First Digit Is %d\n",ld);
    }
}

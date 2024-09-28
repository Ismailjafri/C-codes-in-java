package Loop_Advance;

import java.util.Scanner;

public class Q3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int a = input.nextInt();
        int max=0,min=9;

        for (int i = a; i > 0 ; i/=10) {
            int ld = i%10;
            if(ld>max){
                max = ld;
            }
            if(ld<min){
                min = ld;
            }
        }

        System.out.printf("The Max: %d\n The Min: %d",max,min);
    }
}

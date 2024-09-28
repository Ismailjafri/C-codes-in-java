package Loop_Advance;

import java.util.*;

public class Q2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int a = input.nextInt();
        int min=a,max=a;
        float sum=0;


        for (int i = 1; i < 10 ; i++) {
            System.out.print("Enter Another Number: ");
             a = input.nextInt();
            sum=sum+a;
            if(a >= max){
                max = a;
            }
            if(a <= min){
                min = a;
            }
        }

        System.out.printf("The Max Is %d, The Min Is %d, The Average Is %f",max,min,sum/10);
    }
}

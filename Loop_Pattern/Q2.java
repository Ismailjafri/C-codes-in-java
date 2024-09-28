package Loop_Pattern;

import java.util.*;

public class Q2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No. Of Rows : ");
        int r = input.nextInt();

        System.out.print("Enter No. of Columns : ");
        int c = input.nextInt();

        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= c ; j++) {
                if(j%2==0){
                    System.out.print("#");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

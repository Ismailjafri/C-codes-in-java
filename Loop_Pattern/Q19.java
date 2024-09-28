package Loop_Pattern;

import java.util.*;

public class Q19 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Size Of The Pattern: ");
        int a = input.nextInt();

        int no = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(no++);
            }
            if(i!=1){
                no--;
            }
            System.out.println();
        }

    }
}

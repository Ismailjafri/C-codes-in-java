package Loop_Pattern;

import java.util.*;

public class Q17 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No. Of Rows : ");
        int r = input.nextInt();

        System.out.print("Enter No. of Columns : ");
        int c = input.nextInt();

        int no = 1;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c ; j++) {
                System.out.print(no++);
            }
            no-=2;
            System.out.println();
        }

    }
}

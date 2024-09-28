package Loop_Pattern;

import java.util.*;

public class Q16 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No. Of Rows : ");
        int r = input.nextInt();

        System.out.print("Enter No. of Columns : ");
        int c = input.nextInt();

        char alp = 'A';

        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= c ; j++) {
                System.out.print(alp++);
            }
            alp-=2;
            System.out.println();
        }

    }
}

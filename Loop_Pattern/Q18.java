package Loop_Pattern;

import java.util.*;

public class Q18 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Size Of The Pattern: ");
        int a = input.nextInt();

        char alp = 'A';

        for(int i = 1; i <= a ; i++){
            for (int j = 1; j <= i ; j++) {
                System.out.print(alp++);
            }
            System.out.println();
            if(i!=1){
                alp--;
            }
        }

    }
}

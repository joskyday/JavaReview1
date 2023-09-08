package codeInGame;

import java.util.Scanner;

public class MaxDividedByMin {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
      /*  int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
*/
        int A=4,B=2,C=3;
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        int[] arr={A,B,C};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<3;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];

            }
        }
        if(min==0) min=1;
        int result=max/min;
        System.out.println(result);

    }
}

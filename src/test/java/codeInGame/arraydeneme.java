package codeInGame;

import java.util.Scanner;

public class arraydeneme {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][]arr=new int[N][2];
        int A=0,B=0;
        for (int i = 0; i < N; i++) {
            A = in.nextInt();
            B = in.nextInt();
            arr[i]= new int[]{A, B};

        }
        for(int i=0;i<N;i++){
            System.out.println(arr[i][0]*arr[i][0]+arr[i][1]);
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


    }
}

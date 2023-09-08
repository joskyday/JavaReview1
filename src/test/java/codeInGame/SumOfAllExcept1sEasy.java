package codeInGame;

import java.util.Scanner;

public class SumOfAllExcept1sEasy {
    /*John loves to play with grid games. We have to help him. He is playing with a
N by N square grid contain numbers.
Each cell in the grid either 1 or 7. There are exactly C cells which contains 1.
Find the sum of all numbers that are not 1
Input
Line : 1 C
Line : 2 N
N lines Grid
Output
The sum of all numbers that are not 1
*/
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int c = in.nextInt();
            int n = in.nextInt();
            if (in.hasNextLine()) {
                in.nextLine();
            }
            for (int i = 0; i < n; i++) {
                String row = in.nextLine();
            }

            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");
            int sum = (n * n - c) * 7;
            System.out.println(sum);
        }
    }


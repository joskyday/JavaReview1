package codeInGame;

import java.util.Scanner;

public class ManhattanDistance {
    /***Introduction**:
     The "Manhattan Distance" is the distance between two points in an N dimensional space. In simple terms, it is the sum of absolute differences between the measures in all dimensions of two points.

     2D Example:
     Point1: (x1, y1) Point2: (x2, y2) Manhattan Distance: |x1-x2| + |y1-y2|;

     3D Example:
     Point1: (x1, y1, z1) Point2: (x2, y2, z2) Manhattan Distance: |x1-x2| + |y1-y2| + |z1-z2|

     **Challenge**:
     Given two points A and B, calculate the Manhattan Distance between them.
     Input
     Line 1 : N an integer, the number of dimensions.
     Line 2 : N integers, the coordinate of point A.
     Line 3 : N integers, the coordinate of point B.
     Output
     An integer answer, the manhattan distance between A and B.
     Constraints
     1 ≤ N ≤ 10
     -1000 ≤ coordinates ≤ 1000
     */
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            int [] a=new int[N];
            int [] b=new int[N];
            int answer=0;
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                b[i] = in.nextInt();
            }
            for(int i=0;i<N;i++){
                answer+=Math.abs(a[i]-b[i]);
            }

            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(answer);


    }
}

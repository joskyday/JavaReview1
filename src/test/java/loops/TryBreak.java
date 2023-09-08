package loops;

public class TryBreak {

    public static void main(String[] args) {
       outer: for (int i = 0; i < 5; i++) {
            System.out.print("i= "+i+" ");
       inner:     for (int j = 0; j < 6; j++) {
                System.out.println("j = " + j);
                if(j==5) break outer;

            }

        }




    }

}

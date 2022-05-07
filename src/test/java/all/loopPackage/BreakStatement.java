package all.loopPackage;

public class BreakStatement {
    public static void main(String[] args) {
       outer: for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println("j= "+j);
                if(j==1) break outer;
            }
            System.out.println("i= "+i);



        }
    }
}

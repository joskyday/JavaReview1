package all.loopPackage;

public class NestedLoop {

    public static void main(String[] args) {

        for(int i=0;i<3;i++){ //first run of outer loop i=0


            for(int j=0;j<3;j++){  //j=0 first run of inner loop
                                   //j=1 second run
                                    //j=2  third run
                System.out.print("*");

            }
            System.out.println();

        }




    }
}

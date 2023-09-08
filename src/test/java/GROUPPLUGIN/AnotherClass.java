package GROUPPLUGIN;
import static java.lang.Math.*;
public class AnotherClass {
    public static void main(String[] args) {
        StaticPractice staticPractice=new StaticPractice();
        staticPractice.verb=10;
        //staticPractice.num=23;
        StaticPractice staticPractice2=new StaticPractice();
        staticPractice2.verb=20;
        staticPractice2.num=34;


        System.out.println("staticPractice.verb = " + staticPractice.verb);  //-- 10

        System.out.println("staticPractice.num = " + staticPractice.num);


        System.out.println("staticPractice2.num = " + staticPractice2.num);

        staticPractice.calcc();

        System.out.println(pow(3, 4)); //3^4  3*3*3*3





    }
}

package b28.layer;

public class Practice1 {
    public static void main(String[] args) {
        //Question 1
        int i = 11;
        i = i++ + ++i; //11 + 13 = 24
        System.out.println(i);//24


        //Question 2
        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b; //11 + 22 + 11 + 22 + 13 + 24 = 103
        System.out.println("a=" + a); //13
        System.out.println("b=" + b); //24
        System.out.println("c=" + c); //103
/*
        //Question 3
        int z = 0;

        z = z++ - --z + ++z - z--; //0 - 0 + 1 - 1 =0
        System.out.println(z); //0


*/


    }



}

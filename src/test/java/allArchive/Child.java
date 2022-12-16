package allArchive;

public class Child extends Parent{

    public Child(int num, double pinumber) {
        super(num, pinumber);
    }

    public Child() {
        super();
        super.num=12;
    }

    public static void method1(){

    }

    public void method2(){
        System.out.println("child method2");
    }

     static class InnerClass1{

        static class InnerClass2{

             public static void methodInteresting(){

             }


         }



     }


public static void sum(int a,int b, int c){
    System.out.println(a+b+c);
}






    public static void main(String[] args) {
        Child c=new Child();
        c.num=1;
        Child.method1();
        //c.method2();
        Parent.method1();


        Parent p=new Child();
        //p.method2();
        p.method3();
        Child.InnerClass1.InnerClass2.methodInteresting();


    }
}

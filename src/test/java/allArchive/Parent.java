package allArchive;

public class Parent {
    int num;
     private final double PI_NUMBER;


    public Parent(int num,double pinumber) {
        this.num = num;
        PI_NUMBER=pinumber;
    }

    public Parent() {
        PI_NUMBER=3.14;
    }

    public double getPI_NUMBER() {
        return PI_NUMBER;
    }

    public static void method1(){

    }
    public void method2(int a,double b){
        System.out.println("parent method2");
    }

    public void method3(){
        System.out.println("parent method3");
    }

    public void method2(double x,int a, int c){
        System.out.println("parent method222222");

    }





}


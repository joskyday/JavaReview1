package all.reviewPackage;

public class Deneme1 {
    public static void main(String[] args) {
    int x=6;
    Deneme1 deneme1=new Deneme1();
    deneme1.doStuff(x);
        System.out.println("main x ="+x);

    }
    public static void helebi(){
        System.out.println("helebi");
    }
    public void doStuff(int x){
        System.out.println("doStuff = "+x++);
    }

    public static double  deneme1(){
    return 1.1;
    }
    public static int deneme1(int a,int b){
        return 1;
    }

}

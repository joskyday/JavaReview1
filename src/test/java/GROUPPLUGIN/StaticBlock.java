package GROUPPLUGIN;

public class StaticBlock {
    //static variables
    public static int x;
    public static int y;
    //first static block
    static {
        x = 10;
        y = 20;
        System.out.println(x);
        System.out.println(y);
        System.out.println("first static block is executed");
    }
    //main method
    public static void main(String[] args) {
        System.out.println("main method is executed");
    }
    //second static block
    static {
        System.out.println("second static block is executed");
    }
}

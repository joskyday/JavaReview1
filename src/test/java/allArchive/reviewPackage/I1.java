package allArchive.reviewPackage;

public interface I1 extends I2 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
    public default double experience(){
        System.out.println("Hello_ex");
        return 0.4;
    }
    public void experience1();


}

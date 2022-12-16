package abstractPack;

public interface NameIt {
    void nameIt();
    static void method1(){

    }
    default int method2(){
        return 1;
    }


}

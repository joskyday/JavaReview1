package abstractPack;

public class ChildOfAbstraction extends Abstraction implements NameIt{
    /**
     * @param num
     */
    @Override
    public void mymethod(int num) {

    }

    /**
     *
     */
    @Override
    public void nameIt() {

    }

    public static void main(String[] args) {
        ChildOfAbstraction childOfAbstraction=new ChildOfAbstraction();
        childOfAbstraction.method2();
    }
}

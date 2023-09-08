package GROUPPLUGIN.abstraction;

public class NormalClass extends AbstractA implements MyExperimentalInterface{


    /**
     *
     */
    @Override
    public void method1() {

    }

    /**
     *
     */
    @Override
    public void method2() {

    }

    /**
     *
     */
    @Override
    public void method3() {

    }

    /**
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public double notreadyyet(int num1, double num2) {
        return 0;
    }

    /**
     * @param num1
     * @param num2
     */
    @Override
    public double notreadyyet(double num1, float num2) {

        return num1+num2;
    }

    private class myInnerVoice{

    }
}

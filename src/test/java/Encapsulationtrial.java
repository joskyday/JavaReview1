public class Encapsulationtrial {
    private static final String variableName="myAlternateSolution";
    //private String anotherOne;


    public static String getVariableName() {
        return variableName;
    }

    public Encapsulationtrial() {
    }


    /*public Encapsulationtrial(String variableName) {
        this.variableName = variableName;
    }*/

    public static void main(String[] args) {
        //Encapsulationtrial objectA=new Encapsulationtrial();
        System.out.println(Encapsulationtrial.getVariableName());
    }


    //1. initialize it directly
    //private static final String variableName="myAlternateSolution";
    //2. or initliaze by constructor


}

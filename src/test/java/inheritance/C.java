package inheritance;

public class C extends Animal {
    public static void main(String[] args) {

        Animal flamingo=(Animal) new Bird();
        flamingo.num=3;
        flamingo.eyeColor="red";

        flamingo.a();

    }


    public static class Foot{



    }






}


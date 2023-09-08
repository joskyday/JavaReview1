import access.HeyHey;

public class ChildOfHeyHey extends HeyHey {
    public static void main(String[] args) {
        ChildOfHeyHey child=new ChildOfHeyHey();
      String some="m";

        child.numf=1.3f;

        ChildOfHeyHey kid=new ChildOfHeyHey();
        kid.numf=2.3f;



        child.num=1;




        System.out.println(child.numf);




    ChildOfHeyHey child2=new ChildOfHeyHey();
    child2.example();

    child2.word="Experiement";
ChildOfHeyHey tryme=new ChildOfHeyHey("anything");


    }


    public ChildOfHeyHey(String word) {
        super();
        super.word=word;

    }

    /*public static void example(){
        System.out.println("I am from childClass");
    }*/
public String word;

    public ChildOfHeyHey() {
    }
}

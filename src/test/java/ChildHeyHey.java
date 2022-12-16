import access.HeyHey;

public class ChildHeyHey extends HeyHey {

    public ChildHeyHey(int num){
        super.num=num;
    }

    public ChildHeyHey() {
    }

    public static void main(String[] args) {

         ChildHeyHey childHeyHey=new ChildHeyHey();
         childHeyHey.num=8;
    }
}

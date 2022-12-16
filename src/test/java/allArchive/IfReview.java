package allArchive;

/*
* var1  var2
3       5

var1<var2    3<5    true
grade>100 print wrong input  if()
grade <0 wrong input         else if()

grade <=100
85+  A  else if ()
75-85 B  else if()
60-75 C  else if()
50-60 D  else if()

50 F     else if()




if(grade>=85){
system.out.print(well done, you got A);*/
    public class IfReview {
        private String username;
        public static String name;

        public IfReview() {
        }

        public IfReview(String username) {
            this.username = username;
        }

        static{
        name="heyo";
    }

    public static void main(String[] args) {

        IfReview ifReview=new IfReview();

        ifReview.name="yoyo";
        IfReview newIfReview=new IfReview();
        newIfReview.name="nono";
        IfReview lastIfReview=new IfReview();
        System.out.println(lastIfReview.name);

        IfReview eyey=new IfReview("myname");

        dog d=new dog();
        System.out.println(d.printme());
    }
}



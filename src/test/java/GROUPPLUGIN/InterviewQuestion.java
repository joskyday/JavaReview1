package GROUPPLUGIN;

public class InterviewQuestion {
    static {
        System.out.println("Hello World");
        //this.z=12;
    }
    {
        System.out.println("another hello from here");
    }

    int x;
    double y;
    static int z;
    public InterviewQuestion() {
    }
    public InterviewQuestion(int x,double y) {
        this.x=x;
      this.y=y;
      //this.z=12;


    }
    public static void main(String[] args) {
      // InterviewQuestion iq=new InterviewQuestion();
        InterviewQuestion iq=new InterviewQuestion(3,4);
        System.out.println(iq.toString());
        System.out.println("iq.x+iq.y = " + (iq.x + iq.y));
        int num=67;
        System.out.println("num = " + num);
        //this.z=12;
    }

    @Override
    public String toString() {
        return "InterviewQuestion{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

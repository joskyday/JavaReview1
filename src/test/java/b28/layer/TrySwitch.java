package b28.layer;

public class TrySwitch {
    public static void main(String[] args) {

        String day="fri";

        switch (day){
            //mon, tue, wed, thu, fri, default
            case "mon":
                System.out.println("take your umbrella");
                break;
            case "tue":
                System.out.println("goto baseball match");
                break;
            case "wed":
                System.out.println("wed");
            case "thu":
                System.out.println("thu");
                break;
                case "fri":
                System.out.println("fri");

            default:
                System.out.println("default");
        }




    }
}

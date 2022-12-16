package allArchive;

public class switchStudy {
    public static void main(String[] args) {
        String[] things = {"hourse","shed","slide","zebra","park","garden"};
        for (String s:things
             ) {
            switch (s.charAt(1)){
                case 'h':
                    System.out.print(1);
                    break;
                case 'a':
                    System.out.print(2);
                case 's':
                    System.out.print(3);
                    break;
                case 'o':
                default:
                    System.out.print(4);
                case 'p':
                    System.out.print(5);
                    break;
                case 'z':
                    System.out.print(6);
                case 'l':
                    break;
                case 'g':
                    System.out.print(7);
            }
        }
    }
}

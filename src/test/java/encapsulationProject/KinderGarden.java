package encapsulationProject;

public class KinderGarden {
    // create a price calculator for a student for the given age
    // using encapsulation
    // create two private variables
    //1--- integer age
    //2--  double  price
    // create a method in the class to calculate price
    private final int age;
    private double price;

    public KinderGarden(int age) {
        this.age = age;
    }

    /**public void setAge(int age) {
        this.age = age;
    }*/

    public double getPrice() {
        if (age > 6) {
            System.err.println("We do not support above age 6");
        } else if (age == 6) {
            price = age * 220;
            System.out.println("Price for age 6 is " + price);
        } else if (age == 5) {
            price = age * 180;
            System.out.println("Price for age 5 is " + price);
        } else if (age == 4) {
            price = age * 140;
            System.out.println("Price for age 4 is " + price);
        } else if (age <= 3 && age >= 0) {
            price = age * 120;
            System.out.println("Price for age" + age + " is " + price);
        } else
        {
            System.err.println("invalid data");
            return -1.0;
        }
        return price;
    }

    public static void main(String[] args) {
        KinderGarden kg = new KinderGarden(6);
        //kg.setAge(-3);
        kg.getPrice();
    }
}

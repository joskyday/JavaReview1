package allArchive.reviewPackage;

public class Person {
    public String firstName;
    protected String lastName;
    int age;
    double experience_years;
    public  String jobTitle;

    public Person() {

    }

    public Person(String firstName, String lastName, int age, double experience_years, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.experience_years = experience_years;
        this.jobTitle = jobTitle;
        double salary=salaryCalculator(age,experience_years,jobTitle);
    }

    public double salaryCalculator(int age, double experience_years, String jobTitle){

        return 0;
    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class  Student{
    private   String name;
    private Integer number;
    private String batch;

    public Student(String name, Integer number, String batch) {
        this.name = name;
        this.number = number;
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", batch='" + batch + '\'' +
                '}';
    }
}




public class SortObjects {
    public static void main(String[] args) {

        Student student1=new Student("A",6,"B1");
        Student student2=new Student("C",5,"B2");
        Student student3=new Student("B",4,"B3");
        Student student4=new Student("E",3,"B4");
        Student student5=new Student("D",2,"B5");
        Student student6=new Student("F",1,"B6");

        List<Student> students=new ArrayList<>(Arrays.asList(student1,student3,student6,student4,student2,student5));

        students.sort(Comparator.comparing(Student::getBatch));

        System.out.println(students);

    }
}

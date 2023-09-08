package GROUPPLUGIN;

import java.util.ArrayList;

public class Cars {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        ArrayList<String> cars2=new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars2.add("Volvo");
        cars2.add("Ford");
        for (String s : cars2) {
            cars.add(s);
        }
        cars.remove("Volvo");
        System.out.println(cars);
    }
}

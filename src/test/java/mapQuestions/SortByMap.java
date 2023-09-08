package mapQuestions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortByMap {
    public static void main(String[] args) {




    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map){
        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap();
        for(Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }

}

package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {

        //key:value
        Map<String,Boolean> linkedHashMap = new LinkedHashMap();

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"text1");
        map.put(5,"text5");
        map.put(62,"text62");
        map.put(62,"text645");//duplicate key

        //map.remove(1);

        for (Map.Entry<Integer, String> m:map.entrySet()) {
            System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());
        }

    }




}

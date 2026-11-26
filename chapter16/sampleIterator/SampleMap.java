package sampleIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SampleMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(95, "論理回路");
        map.put(97, "半導体工学");
        map.put(99, "電磁工学");

        Iterator<Integer> m = map.keySet().iterator();
        while (m.hasNext()) {
            int id = m.next();
            System.out.println(id + " : " + map.get(id));
        }

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println();
        System.out.println("Entry");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}

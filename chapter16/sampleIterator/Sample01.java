package sampleIterator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Sample01 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();// HashSet is a collection that stores only unique elements and
                                                    // does not allow duplicates. It is useful when we only care about
                                                    // distinct values. //It is useful when we only care about distinct values.
        set.add("たなか");                           // ● Allows only one null value
        set.add("すずき");                           // ● Uses add() method to insert elements
        set.add("さいとう");

        System.out.println("Set Iterator");
        Iterator<String> itset = set.iterator();
        while (itset.hasNext()) {                    // Iterator exist cuz collections dont have indexes so we cant do
            System.out.println(itset.next());        // set.get(0) like Arraylist which has get() so thats where iterator comes in
        }                                            // its also safe for removal
        System.out.println();
        System.out.println("Set Enchanced for-loop"); 

        for (String s : set) {                       // for everyday coding we use enhanced for-loop instead since its cleaner and
                                                     // easier to read
            System.out.println(s);                   // user iterator when
        }                                            // ● You need to remove elements while traversing
                                                     // ● You need manual control over traversal
        System.out.println();
        System.out.println();

        //The same idea also applies for map
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(97, "線形代数");
        map.put(98, "言語理論");
        map.put(99, "人工知能");

        System.out.println("Map Iterator");

        Iterator<Integer> itmap = map.keySet().iterator();
        while (itmap.hasNext()) {
            int id = itmap.next();
            System.out.println(id + " : " + map.get(id));
        }

        System.out.println();

        System.out.println("Map Enchanced for-loop");
        for (Integer id : map.keySet()) {                           //map.values() if we want to display the values
            System.out.println(id + " : " + map.get(id));
        }

        System.out.println();

        System.out.println("Map Entry");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

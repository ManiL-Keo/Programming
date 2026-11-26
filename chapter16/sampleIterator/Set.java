package sampleIterator;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("ソフトウェア工学");
        set.add("論理回路");
        set.add("半導体工学");

        printAll(set.iterator());
    }

    public static void printAll(Iterator<String> it){   //Whether its a set or list, iterator still process the same way
        while(it.hasNext()){
            System.out.println(it.next());
        }
    } 
    
}

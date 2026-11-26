package samplelist;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample05 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("たなか");
        names.add("すずき");
        names.add("さいとう");

        Iterator<String> name = names.iterator(); //basically a loop. 
                                                // it allows you to safely remove elements from a collection while looping through it.
        while(name.hasNext()){
            String n = name.next();
            System.out.println(n);
        }
    }
}

package samplelist;

import java.util.ArrayList;

public class Sample02 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("たなか");
        names.add("すずき");
        names.add("さいとう");
        names.add("ウィンgay");

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        System.out.println();

        System.out.println(names.remove(2));
        System.out.println(names.get(02));

        System.out.println(names.set(1, "山田"));
        System.out.println(names.get(1));


        // System.out.println(names.isEmpty());
        // System.out.println(names.contains("ウィンgay"));
        // System.out.println(names.size());
        // names.clear();
        // System.out.println(names);
        // System.out.println(names.isEmpty());
    }
}

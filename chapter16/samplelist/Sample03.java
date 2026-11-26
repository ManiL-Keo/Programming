package samplelist;

import java.util.ArrayList;

public class Sample03 {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<Integer>();

        points.add(10);
        points.add(70);
        points.add(29);

        for(int point : points){
            System.out.println(point);
        }

        int size = points.size();
        System.out.println(size);

        boolean result = points.contains(67);
        System.out.println(result);

        
    }
}

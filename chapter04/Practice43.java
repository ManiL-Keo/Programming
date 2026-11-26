package chapter04;

public class Practice43 {
    public static void main(String[] args) {
        int[] counts = null;
        float[] heights = {171.3F, 175.0F};
        // System.out.println(counts[1]); //Null Pointer Exception
        System.out.println(heights[2]); //Array index out of bounds exception
    }
}

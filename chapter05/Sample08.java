package chapter05;

public class Sample08 {

    public static int getMaxScore(int[] scores) {
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] scores = {70, 85, 100, 90, 85};
        int max = getMaxScore(scores);
        System.out.println(max);
    }
}
